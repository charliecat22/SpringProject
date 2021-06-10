package com.example.springbootproject.Cache;

/**
 * @author ZYH
 * @date 2021-06-10 11:58 下午
 **/
public interface IBaseCache<E, T> {
    public E get(T obj);
}
