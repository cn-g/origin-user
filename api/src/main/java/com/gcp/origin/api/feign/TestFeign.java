package com.gcp.origin.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "origin-user")
public interface TestFeign {

    @GetMapping("/getTest")
    String getTest();

}
