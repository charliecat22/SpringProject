package com.example.springbootproject.common.service;

/**
 * 品种接口
 *
 * @author zhouyanhao@yingzhengdt.com
 * @ClassName ITypeService
 * @CreateDate 2021/6/15  13:38
 * @Version 0.0.1
 * @Copyright (c) 2021, 赢证（上海）数字科技有限公司 All Rights Reserved.
 */
public interface ITypeService {
    /**
     * 品种字段校验
     *
     * @param pojo
     * @param <T>
     * @return
     */
    <T> boolean typeCheck(T pojo);
}
