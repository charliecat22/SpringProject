package com.example.springbootproject.Cache;

import com.example.springbootproject.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ZYH
 * @date 2021-06-10 11:59 下午
 **/
public class MapCache implements IBaseCache<MapResult, MapKey> {
    private static MapCache mapCache = new MapCache();
    private static Map<String, MapResult> cacheMap;
    @Autowired
    BaseServiceImpl baseService;

    private MapCache() {
        cacheMap = new HashMap<>();
        baseService = new BaseServiceImpl();
    }

    public static MapCache getInstance() {
        return mapCache;
    }


    @Override
    public MapResult get(MapKey obj) {
        baseService.method();
        return cacheMap.get(obj.getKey());
    }
}
