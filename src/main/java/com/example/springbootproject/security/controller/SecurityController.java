package com.example.springbootproject.security.controller;

import com.example.springbootproject.common.service.IDistributeService;
import com.example.springbootproject.security.dto.DataDTO;
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
@Api(tags = "债券品种控制器")
@RestController
public class SecurityController {
    @Autowired
    IDistributeService iDistributeService;

    @ApiOperation(value = "债券品种入口")
    @PostMapping("/handle")
    public void handle(@RequestBody DataDTO dataDTO) {
        //所有入口统一调用分发接口
        iDistributeService.distribute(dataDTO);
    }
}
