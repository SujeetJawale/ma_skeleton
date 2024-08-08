package com.telusko.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="TELUSKOAPP1")
public interface feignClientExample {

    @GetMapping("/info")
    public String invokeGetRequest();

}
