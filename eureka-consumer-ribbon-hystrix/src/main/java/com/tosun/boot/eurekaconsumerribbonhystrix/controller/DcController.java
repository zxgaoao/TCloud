package com.tosun.boot.eurekaconsumerribbonhystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: DcController
 * @Description:
 * @author: Start
 * @date: 2019/6/11 8:28
 * @version: v1.0
 */
@RestController
public class DcController {

    @Autowired
    ConsumerService consumerService;

    @GetMapping("/consumer")
    public String dc(){
        return consumerService.consumer();
    }

    @Service
    class ConsumerService {

        @Autowired
        RestTemplate restTemplate;

        @HystrixCommand(fallbackMethod = "fallback")
        public String consumer(){
            return restTemplate.getForObject("http://eureka-client1/dc",String.class);
        }

        public String fallback(){
            return "fallback";
        }

    }

}
