package com.example.springbootproject.common.check;

import cn.hutool.core.util.StrUtil;
import com.example.springbootproject.common.dto.CommonDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 校验CommonDTO
 *
 * @author ZYH
 * @date 2021-06-12 12:01 上午
 **/
@Slf4j
@Component
public class CommonCheck extends AbstractCheck {

    @Override
    public <T> boolean check(T pojo) {
        CommonDTO commonDTO = (CommonDTO) pojo;
        log.info("进入CommonCheck");
        if (StrUtil.hasEmpty(commonDTO.getTradeMode())) {
            log.error("CommonCheck：校验失败，交易方式不能为空！");
            return false;
        } else {
            return true;
        }
    }
}
