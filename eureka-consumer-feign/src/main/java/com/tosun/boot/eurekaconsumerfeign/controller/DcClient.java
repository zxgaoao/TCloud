package com.tosun.boot.eurekaconsumerfeign.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client1")
public interface DcClient {

    @GetMapping("/dc")
    String consumer();

}
