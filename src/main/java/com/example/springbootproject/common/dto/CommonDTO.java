package com.example.springbootproject.common.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author ZYH
 * @date 2021-06-11 11:36 下午
 **/
@Data
public class CommonDTO {
    @ApiModelProperty("交易方式")
    private String tradeMode;
}
