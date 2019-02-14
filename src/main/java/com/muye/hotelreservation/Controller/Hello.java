package com.muye.hotelreservation.Controller;

import com.muye.hotelreservation.Service.THello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @Autowired
    THello tHello;

    @GetMapping("/hello.do")
    public String hello(){
        return tHello.THello();
    }
}
