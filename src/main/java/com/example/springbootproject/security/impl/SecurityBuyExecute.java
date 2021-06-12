package com.example.springbootproject.security.impl;

import com.example.springbootproject.common.bo.IndicatorResultBO;
import com.example.springbootproject.common.constant.BeanIdConstant;
import com.example.springbootproject.common.service.IExecuteService;
import com.example.springbootproject.security.check.SecurityBuyCheck;
import com.example.springbootproject.security.dto.SecurityBuyDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 债券买入实现类
 *
 * @author ZYH
 * @date 2021-06-12 1:35 上午
 **/
@Service(BeanIdConstant.SECURITY_BUY)
@Slf4j
public class SecurityBuyExecute implements IExecuteService {
    @Autowired
    SecurityBuyCheck securityBuyCheck;

    @Override
    public <R> boolean ruleCheck(R rule) {
        //债券买入前置规则校验
        log.info("进入交易方式规则校验");
        return true;
    }

    @Override
    public <T> List<IndicatorResultBO> execute(T pojo) {
        log.info("进入交易方式执行");
        List<IndicatorResultBO> indicatorResultBOList = new ArrayList<>();
        SecurityBuyDTO securityBuyDTO = new SecurityBuyDTO();
        BeanUtils.copyProperties(pojo, securityBuyDTO);
        if (securityBuyCheck.check(securityBuyDTO)) {
            //准备参数
            //调用行为服务接口
            //获得变动数据
            log.info("调用行为服务");
            indicatorResultBOList = new ArrayList<>();
        } else {
            log.error("该流水校验未通过!", securityBuyDTO.getTradeMode());
        }
        return indicatorResultBOList;
    }
}
