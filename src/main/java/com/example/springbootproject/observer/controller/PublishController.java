package com.example.springbootproject.observer.controller;

import com.example.springbootproject.observer.service.PublishService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 发布控制器
 *
 * @author zhouyanhao@yingzhengdt.com
 * @date 2021/7/21  10:04
 * @Copyright (c) 2021, 赢证（上海）数字科技有限公司 All Rights Reserved.
 */
@Api(tags = "发布控制器")
@RestController
public class PublishController {
    @Autowired
    PublishService publishService;

    @ApiOperation(value = "发布")
    @PostMapping("/publish")
    public <T> void publish(@RequestBody T data) {
        publishService.publish(data);
    }
}
