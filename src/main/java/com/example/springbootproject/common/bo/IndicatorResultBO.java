package com.example.springbootproject.common.bo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 业务指标变动结果
 *
 * @author ZYH
 * @date 2021-06-12 1:29 上午
 **/
@Data
public class IndicatorResultBO {
    @ApiModelProperty("指标代码")
    private String indicator;
    @ApiModelProperty("变动金额")
    private BigDecimal changeMoney;
    @ApiModelProperty("方向")
    private BigDecimal direct;

}
