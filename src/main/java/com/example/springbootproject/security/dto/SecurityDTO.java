package com.example.springbootproject.security.dto;

import com.example.springbootproject.common.dto.CommonDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author ZYH
 * @date 2021-06-11 11:38 下午
 **/
@Data
public class SecurityDTO extends CommonDTO {
    @ApiModelProperty("证券代码")
    private String securityCode;
}
