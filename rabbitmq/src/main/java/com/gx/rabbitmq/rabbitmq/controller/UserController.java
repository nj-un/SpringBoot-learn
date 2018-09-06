package com.gx.rabbitmq.rabbitmq.controller;

import com.gx.rabbitmq.rabbitmq.config.RabbitConfig;
import com.gx.rabbitmq.rabbitmq.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        this.rabbitTemplate.convertAndSend(RabbitConfig.DEFAULT_USER_QUEUE, user);
        this.rabbitTemplate.convertAndSend(RabbitConfig.MANUAL_USER_QUEUE, user);
    }

}
