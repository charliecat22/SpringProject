package com.example.springbootproject.observer.listener;

import com.example.springbootproject.observer.event.OrderEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 短信监听（异步执行）
 *
 * @author zhouyanhao@yingzhengdt.com
 * @date 2021/7/20  14:27
 * @Copyright (c) 2021, 赢证（上海）数字科技有限公司 All Rights Reserved.
 */
@Slf4j
@Component
public class SmsListener implements ApplicationListener<OrderEvent> {

    /**
     * Handle an application event.
     *
     * @param event the event to respond to
     */
    @Override
    @Async
    public void onApplicationEvent(OrderEvent event) {
        System.out.println(Thread.currentThread() + "...短信监听到..." + event.getMessage() + "......" + event.getSource());
    }
}
