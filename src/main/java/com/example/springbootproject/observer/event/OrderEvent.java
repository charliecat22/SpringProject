package com.example.springbootproject.observer.event;

import org.springframework.context.ApplicationEvent;

/**
 * 订单事件
 *
 * @author zhouyanhao@yingzhengdt.com
 * @date 2021/7/20  14:20
 * @Copyright (c) 2021, 赢证（上海）数字科技有限公司 All Rights Reserved.
 */
public class OrderEvent extends ApplicationEvent {
    private String message;

    public OrderEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    @Override
    public Object getSource() {
        return super.getSource();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
