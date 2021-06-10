package com.example.springbootproject.controller;

import com.example.springbootproject.Cache.MapCache;
import com.example.springbootproject.Cache.MapKey;
import com.example.springbootproject.service.BaseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZYH
 * @date 2021-06-10 11:28 下午
 **/
@Api(tags = "Api控制器")
@RestController
public class ApiController {

    @Autowired
    private ApplicationContext applicationContext;

    @ApiImplicitParam(name = "name", value = "姓名", required = true)
    @ApiOperation(value = "获取bean实例")
    @PostMapping("/bean")
    public void bean(@RequestParam("name") String name) {
        try {
            BaseService baseService = (BaseService) applicationContext.getBean(name);
            baseService.method();
        } catch (NoSuchBeanDefinitionException e) {
            System.out.println("没有");
        }
    }

    @ApiOperation(value = "获取缓存")
    @PostMapping("/getCache")
    public void getCache() {
        MapKey mapKey = new MapKey();
        mapKey.setKey("1");
        MapCache.getInstance().get(mapKey);
    }
}
