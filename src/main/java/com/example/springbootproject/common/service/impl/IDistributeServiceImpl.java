package com.example.springbootproject.common.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.example.springbootproject.common.bo.IndicatorResultBO;
import com.example.springbootproject.common.cache.BeanCache;
import com.example.springbootproject.common.check.CommonCheck;
import com.example.springbootproject.common.dto.CommonDTO;
import com.example.springbootproject.common.service.IDistributeService;
import com.example.springbootproject.common.service.IExecuteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZYH
 * @date 2021-06-10 11:05 下午
 **/
@Service
@Slf4j
public class IDistributeServiceImpl implements IDistributeService {
    @Autowired
    CommonCheck commonCheck;
    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public <T extends CommonDTO> void distribute(T dto) {
        //校验commonDTO
        if (commonCheck.check(dto)) {
            //业务逻辑写在下面
            log.info("进入分发逻辑");
            try {
                //BeanFactory找到交易方式的实现类
                IExecuteService iExecuteService = applicationContext.getBean(BeanCache.getInstance().get(dto.getTradeMode()), IExecuteService.class);
                //前置规则校验
                if (iExecuteService.ruleCheck(dto)) {
                    List<IndicatorResultBO> indicatorResultList = iExecuteService.execute(dto);
                    if (CollectionUtil.isNotEmpty(indicatorResultList)) {
                        //实时余额统计，返回Map<指标，余额POJO>
                    }
                }
            } catch (NoSuchBeanDefinitionException e) {
                log.error("没有权限进行该交易方式：{}", dto.getTradeMode());
            } catch (Exception e) {
                e.printStackTrace();
            }
            //发送给路由->估值
        }
    }
}
