package com.example.springbootproject.security.impl;

import com.example.springbootproject.common.service.ITypeService;

/**
 * @author zhouyanhao@yingzhengdt.com
 * @ClassName SecurityImpl
 * @Description TODO
 * @CreateDate 2021/6/15  13:40
 * @Version 0.0.1
 * @Copyright (c) 2021, 赢证（上海）数字科技有限公司 All Rights Reserved.
 */
public class SecurityImpl implements ITypeService {
    /**
     * 品种字段校验
     *
     * @param pojo
     * @return
     */
    @Override
    public <T> boolean typeCheck(T pojo) {
        //进入品种校验
        return true;
    }
}
