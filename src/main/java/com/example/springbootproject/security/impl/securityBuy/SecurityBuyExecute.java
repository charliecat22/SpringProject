package com.example.springbootproject.security.impl.securityBuy;

import com.example.springbootproject.common.bo.IndicatorResultBO;
import com.example.springbootproject.common.constant.BeanIdConstant;
import com.example.springbootproject.common.service.IExecuteService;
import com.example.springbootproject.security.check.securityBuy.SecurityBuyCheck;
import com.example.springbootproject.security.dto.SecurityBuyDTO;
import com.example.springbootproject.security.impl.SecurityImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
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
public class SecurityBuyExecute extends SecurityImpl implements IExecuteService {

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
        if (SecurityBuyCheck.getInstance().check(securityBuyDTO)) {
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

    /**
     * 交易方式字段校验
     *
     * @param pojo
     * @return
     */
    @Override
    public <T> boolean check(T pojo) {
        //交易方式字段校验
        super.typeCheck(pojo);
        return true;
    }
}
