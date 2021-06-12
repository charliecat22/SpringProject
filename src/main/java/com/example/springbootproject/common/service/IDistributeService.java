package com.example.springbootproject.common.service;

import com.example.springbootproject.common.dto.CommonDTO;

/**
 * 流水分发接口
 *
 * @author ZYH
 * @date 2021-06-10 11:03 下午
 **/
public interface IDistributeService {
    <T extends CommonDTO> void distribute(T dto);
}
