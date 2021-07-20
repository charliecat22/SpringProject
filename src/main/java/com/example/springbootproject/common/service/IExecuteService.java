package com.example.springbootproject.common.service;

import com.example.springbootproject.common.bo.IndicatorResultBO;

import java.util.List;

/**
 * 执行交易方式私有逻辑接口
 *
 * @author ZYH
 * @date 2021-06-12 1:28 上午
 **/
public interface IExecuteService {
    /**
     * 交易行为前置规则校验
     *
     * @param rule
     * @param <R>
     * @return boolean
     */
    <R> boolean ruleCheck(R rule);

    /**
     * 执行交易方式业务逻辑
     *
     * @param pojo
     * @param <T>
     * @return 业务指标结果集
     */
    <T> List<IndicatorResultBO> execute(T pojo);

    /**
     * 交易方式字段校验
     *
     * @param pojo
     * @param <T>
     * @return
     */
    <T> boolean check(T pojo);
}
