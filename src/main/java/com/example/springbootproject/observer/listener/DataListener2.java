package com.example.springbootproject.observer.listener;

import com.example.springbootproject.observer.event.DataEvent;
import com.example.springbootproject.observer.event.OrderEvent;
import com.example.springbootproject.observer.service.impl.PublishServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author zhouyanhao@yingzhengdt.com
 * @date 2021/7/21  10:23
 * @Copyright (c) 2021, 赢证（上海）数字科技有限公司 All Rights Reserved.
 */
@Component
@Slf4j
public class DataListener2 implements ApplicationListener<DataEvent> {
    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void onApplicationEvent(DataEvent event) {
        log.info("监听到来自：{} 的消息：{}", event.getSource(), event.getData());
        //处理逻辑
        PublishServiceImpl.map.put("流水", event.getData());
        //根据逻辑判断是否在发布别的时间
        OrderEvent orderEvent = new OrderEvent(this, "");
        applicationEventPublisher.publishEvent(orderEvent);
    }
}
