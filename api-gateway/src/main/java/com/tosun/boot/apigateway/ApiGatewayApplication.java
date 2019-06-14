package com.tosun.boot.apigateway;

import com.tosun.boot.apigateway.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringCloudApplication
//@SpringBootApplication
public class ApiGatewayApplication {

    @Bean
    public AccessFilter accessFilter(){
        return new AccessFilter();
    }

    /**
     * 解析特定匹配路由 配合[5]正则表达式映射 使用
     * @return
     */
//    @Bean
//    public PatternServiceRouteMapper serviceRouteMapper() {
//        return new PatternServiceRouteMapper(
//                "(?<name>^.+)-(?<version>v.+$)",
//                "${version}/${name}");
//    }

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }

}
