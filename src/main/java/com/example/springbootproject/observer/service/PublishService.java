package com.example.springbootproject.observer.service;

/**
 * 发布接口
 *
 * @author zhouyanhao@yingzhengdt.com
 * @date 2021/7/21  10:05
 * @Copyright (c) 2021, 赢证（上海）数字科技有限公司 All Rights Reserved.
 */
public interface PublishService {
    <T> void publish(T data);
}
