package com.example.springbootproject.observer.impl;

import com.example.springbootproject.observer.event.DataEvent;
import com.example.springbootproject.observer.service.impl.PublishServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author zhouyanhao@yingzhengdt.com
 * @date 2021/7/21  10:20
 * @Copyright (c) 2021, 赢证（上海）数字科技有限公司 All Rights Reserved.
 */
@Component
@Slf4j
public class DataListener {
    @EventListener
    @Async
    public void dataListener(DataEvent dataEvent) {
        PublishServiceImpl.map.put("DataListener", dataEvent.getData());
        log.info("DataListener监听到来自：{} 的消息：{}", dataEvent.getSource(), dataEvent.getData());
    }
}
