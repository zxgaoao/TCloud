package com.tosun.boot.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: DcController
 * @Description:
 * @author: Start
 * @date: 2019/6/10 9:01
 * @version: v1.0
 */
@RestController
public class DcController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc() throws InterruptedException {
//        Thread.sleep(5000L);
        String services = "Services: "+discoveryClient.getServices();
        System.out.println("打印:"+services);
        return services;
    }

}
