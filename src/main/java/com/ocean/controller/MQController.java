package com.ocean.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mq")
public class MQController {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Value("${kafka.test.topic}")
    private String topic;

    private final Logger logger = LoggerFactory.getLogger(MQController.class);

    @PostMapping("/sendMsg")
    public void send(@RequestParam("mobile") String mobile){
        try {
            kafkaTemplate.send(topic, mobile);
        } catch (Throwable ex) {
            logger.warn("send msg to kafka exception,topic:{}", topic, ex);
        }
    }
}
