package com.gx.rabbitmq.rabbitmq.controller;

import com.gx.rabbitmq.rabbitmq.config.RabbitConfig;
import com.gx.rabbitmq.rabbitmq.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.AbstractJavaTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author: gaoxu
 * @date: 2018/9/4
 */
@RestController
@RequestMapping("/users")
public class UserController {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping
    public void get() {
        User user = new User(1l, "adada", "adada");
//        this.rabbitTemplate.convertAndSend(RabbitConfig.DEFAULT_USER_QUEUE, user);
//        this.rabbitTemplate.convertAndSend(RabbitConfig.MANUAL_USER_QUEUE, user);
        // 添加延时队列
        this.rabbitTemplate.convertAndSend(RabbitConfig.REGISTER_DELAY_EXCHANGE, RabbitConfig.DELAY_ROUTING_KEY, user, message -> {
            // TODO 第一句是可要可不要,根据自己需要自行处理
            message.getMessageProperties().setHeader(AbstractJavaTypeMapper.DEFAULT_CONTENT_CLASSID_FIELD_NAME, User.class.getName());
            // TODO 如果配置了 params.put("x-message-ttl", 5 * 1000); 那么这一句也可以省略,具体根据业务需要是声明 Queue 的时候就指定好延迟时间还是在发送自己控制时间
            message.getMessageProperties().setExpiration(5 * 1000 + "");
            return message;
        });
        log.info("[发送时间] - [{}]", LocalDateTime.now());
    }

}
