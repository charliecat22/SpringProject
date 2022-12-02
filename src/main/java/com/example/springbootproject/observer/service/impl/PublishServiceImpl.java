package com.example.springbootproject.observer.service.impl;

import com.example.springbootproject.observer.event.DataEvent;
import com.example.springbootproject.observer.service.PublishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 发布实现类
 *
 * @author zhouyanhao@yingzhengdt.com
 * @date 2021/7/21  10:05
 * @Copyright (c) 2021, 赢证（上海）数字科技有限公司 All Rights Reserved.
 */
@Service
@Slf4j
public class PublishServiceImpl implements PublishService {
    public static ConcurrentHashMap map = new ConcurrentHashMap<>();
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public <T> void publish(T data) {
        log.info("接收到流水！");
        //根据业务类型发送到不同的事件里
        DataEvent dataEvent = new DataEvent(this, data);
        applicationEventPublisher.publishEvent(dataEvent);
        log.info("拿到计算结果：{}", map.toString());
    }
}
