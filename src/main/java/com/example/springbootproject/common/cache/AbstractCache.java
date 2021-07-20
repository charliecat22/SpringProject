package com.example.springbootproject.common.cache;

/**
 * 缓存抽象类
 *
 * @author ZYH
 * @date 2021-06-12 10:30 上午
 **/
public abstract class AbstractCache<V, K, C> {

    /**
     * 加载缓存
     *
     * @param condition
     */
    abstract void load(C condition);

    /**
     * 添加缓存
     *
     * @param value
     */
    abstract void add(V value);

    /**
     * 获取值
     *
     * @param pojo
     * @return
     */
    abstract V get(K pojo);

    /**
     * 清除缓存
     *
     * @param pojo
     * @return
     */
    abstract void clean(K pojo);
}
