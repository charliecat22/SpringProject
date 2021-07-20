package com.example.springbootproject.security.controller;

import com.example.springbootproject.common.dto.CommonDTO;
import com.example.springbootproject.common.service.IDistributeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZYH
 * @date 2021-06-10 11:28 下午
 **/
@Api(tags = "聚合控制器")
@RestController
public class DataController {
    @Autowired
    IDistributeService iDistributeService;

    @ApiOperation(value = "聚合入口")
    @PostMapping("/handle")
    public <T extends CommonDTO> void handle(@RequestBody T t) {
        //所有入口统一调用分发接口
        iDistributeService.distribute(t);
    }
}
