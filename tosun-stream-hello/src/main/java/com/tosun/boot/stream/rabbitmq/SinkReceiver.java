package com.tosun.boot.stream.rabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * mq消费者
 * @ClassName: SinkReceiver
 * @Description:
 * @author: Start
 * @date: 2019/6/14 14:16
 * @version: v1.0
 */
@EnableBinding(Sink.class)
public class SinkReceiver {

    private static Logger logger = LoggerFactory.getLogger(SinkReceiver.class);

    @StreamListener(Sink.INPUT)
    public void receive(Object payload) {
        logger.info("Received:" + payload);
    }

}
