package com.example.springbootproject.security.dto;

import com.example.springbootproject.common.dto.CommonDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author ZYH
 * @date 2021-06-11 11:47 下午
 **/
@Data
public class DataDTO extends CommonDTO {
    @ApiModelProperty("数量")
    private BigDecimal amount;
    @ApiModelProperty("证券代码")
    private String securityCode;
}
