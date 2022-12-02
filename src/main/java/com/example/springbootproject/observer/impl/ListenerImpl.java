package com.example.springbootproject.observer.impl;

import com.example.springbootproject.observer.event.OrderEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * 监听
 *
 * @author zhouyanhao@yingzhengdt.com
 * @date 2021/7/20  15:16
 * @Copyright (c) 2021, 赢证（上海）数字科技有限公司 All Rights Reserved.
 */
@Service
@Slf4j
public class ListenerImpl {
    /**
     * 监听用户注册事件,执行发放优惠券逻辑
     */

    @EventListener
    public void test(OrderEvent event) {
        System.out.println(Thread.currentThread() + "...注解监听到..." + event.getMessage() + "......" + event.getSource());
    }
}
