package com.example.springbootproject.security.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author ZYH
 * @date 2021-06-11 11:40 δΈε
 **/
@Data
public class SecurityBuyDTO extends SecurityDTO {
    @ApiModelProperty("ζ°ι")
    private BigDecimal amount;
}
