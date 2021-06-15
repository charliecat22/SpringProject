package com.example.springbootproject.security.check;

import com.example.springbootproject.security.dto.SecurityBuyDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 债券买入检验类
 *
 * @author ZYH
 * @date 2021-06-12 1:55 上午
 **/
@Slf4j
@Component
public class SecurityBuyCheck extends SecurityCheck {
    private static SecurityBuyCheck securityBuyCheck = new SecurityBuyCheck();

    public SecurityBuyCheck() {
    }

    public static SecurityBuyCheck getInstance() {
        return securityBuyCheck;
    }

    @Override
    public <T> boolean check(T pojo) {
        if (super.check(pojo)) {
            log.info("进入交易方式校验");
            SecurityBuyDTO securityBuyDTO = (SecurityBuyDTO) pojo;
            if (securityBuyDTO.getAmount() != null) {
                return true;
            } else {
                log.info("SecurityBuyCheck：校验失败，数量不能为空！");
                return false;
            }
        } else {
            return false;
        }
    }
}
