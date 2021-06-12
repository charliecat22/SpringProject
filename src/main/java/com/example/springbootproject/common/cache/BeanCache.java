package com.example.springbootproject.common.cache;

import com.example.springbootproject.common.enumeration.BeanOfTradeMode;

import java.util.HashMap;
import java.util.Map;

/**
 * Bean实例缓存
 * 所有缓存类必须继承抽象类Cache
 *
 * @author ZYH
 * @date 2021-06-10 11:59 下午
 **/
public class BeanCache extends AbstractCache<String, String, String> {

    private static final BeanCache beanCache = new BeanCache();
    private static Map<String, String> beanCacheMap;


    private BeanCache() {
        //初始化交易类型与Bean实例对应关系
        beanCacheMap = new HashMap<String, String>() {
            {
                put(BeanOfTradeMode.SECURUTY_BUY.getTradeMode(), BeanOfTradeMode.SECURUTY_BUY.getBeanId());
            }
        };
    }

    public static BeanCache getInstance() {
        //饿汉单例模式
        return beanCache;
    }


    @Override
    public void load(String condition) {
        //加载
    }

    @Override
    public void add(String value) {
        //put
    }

    @Override
    public String get(String key) {
        return beanCacheMap.get(key);
    }
}
