package test;

import com.example.springbootproject.SpringBootProjectApplication;
import com.example.springbootproject.observer.event.OrderEvent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * TODO
 *
 * @author zhouyanhao@yingzhengdt.com
 * @date 2021/7/20  14:38
 * @Copyright (c) 2021, 赢证（上海）数字科技有限公司 All Rights Reserved.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootProjectApplication.class)
public class ObserverTest implements ApplicationEventPublisherAware {
    // 注入事件发布者
    private ApplicationEventPublisher applicationEventPublisher;

    /**
     * Set the ApplicationEventPublisher that this object runs in.
     * <p>Invoked after population of normal bean properties but before an init
     * callback like InitializingBean's afterPropertiesSet or a custom init-method.
     * Invoked before ApplicationContextAware's setApplicationContext.
     *
     * @param applicationEventPublisher event publisher to be used by this object
     */
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Test
    public void test() {
        OrderEvent orderEvent = new OrderEvent(this, "用户下单成功");
        applicationEventPublisher.publishEvent(orderEvent);
        System.out.println("-------over------");
    }
}
