package com.muye.hotelreservation.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("PHotelReservation")
public interface THello {

    @GetMapping("THello.do")
    public String THello();
}
