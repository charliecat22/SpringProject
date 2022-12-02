package com.example.springbootproject.observer.event;

import org.springframework.context.ApplicationEvent;

/**
 * 流水Event
 *
 * @author zhouyanhao@yingzhengdt.com
 * @date 2021/7/21  10:11
 * @Copyright (c) 2021, 赢证（上海）数字科技有限公司 All Rights Reserved.
 */
public class DataEvent<T> extends ApplicationEvent {
    private T data;

    public DataEvent(Object source, T data) {
        super(source);
        this.data = data;
    }

    @Override
    public Object getSource() {
        return super.getSource();
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
