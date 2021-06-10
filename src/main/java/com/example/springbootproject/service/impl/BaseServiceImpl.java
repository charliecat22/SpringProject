package com.example.springbootproject.service.impl;

import com.example.springbootproject.service.BaseService;
import org.springframework.stereotype.Service;

/**
 * @author ZYH
 * @date 2021-06-10 11:05 下午
 **/
@Service("impl1")
public class BaseServiceImpl implements BaseService {
    @Override
    public void method() {
        System.out.println("impl1");
    }
}
