package com.tosun.boot.eureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ApiController
 * @Description:
 * @author: Start
 * @date: 2019/6/12 8:31
 * @version: v1.0
 */
@RestController
@RequestMapping("api-a")
public class ApiController {

    @GetMapping("/hello")
    public String get(){
        return "123456";
    }

}
