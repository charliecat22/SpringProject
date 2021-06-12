package com.example.springbootproject.common.check;

/**
 * 校验抽象类
 *
 * @author ZYH
 * @date 2021-06-11 11:59 下午
 **/
public abstract class AbstractCheck {

    /**
     * 校验字段
     *
     * @param pojo
     * @param <T>
     * @return
     */
    public abstract <T> boolean check(T pojo);
}
