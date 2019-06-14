package com.tosun.boot.stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//@SpringBootTest
@EnableBinding(value = {StreamApplicationTests.SinkSender.class})
public class StreamApplicationTests {

    @Autowired
    private SinkSender sinkSender;

    @Test
    public void contextLoads() {
        sinkSender.output().send(MessageBuilder.withPayload("produce a message ：http://blog.didispace.com").build());
    }

    @Component
    public interface SinkSender {

        String OUTPUT = "input";

        @Output(SinkSender.OUTPUT)
        MessageChannel output();

    }

}
