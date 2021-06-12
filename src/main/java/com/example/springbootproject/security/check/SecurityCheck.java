package com.example.springbootproject.security.check;

import cn.hutool.core.util.StrUtil;
import com.example.springbootproject.common.check.AbstractCheck;
import com.example.springbootproject.security.dto.SecurityDTO;
import lombok.extern.slf4j.Slf4j;

/**
 * @author ZYH
 * @date 2021-06-12 1:54 上午
 **/
@Slf4j
public class SecurityCheck extends AbstractCheck {
    @Override
    public <T> boolean check(T pojo) {
        log.info("进入品种校验");
        SecurityDTO securityDTO = (SecurityDTO) pojo;
        if (!StrUtil.hasEmpty(securityDTO.getSecurityCode())) {
            return true;
        } else {
            log.error("SecurityCheck：校验失败，证券代码不能为空！");
            return false;
        }
    }
}
