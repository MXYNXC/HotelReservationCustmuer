package com.muye.hotelreservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient //标记这是一个客户端 用来消费服务
@EnableFeignClients //基于Feign服务调用
@EnableDiscoveryClient //用于发现服务
public class HotelreservationApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotelreservationApplication.class, args);
    }

}

