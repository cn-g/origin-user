package com.gcp.origin.user.feign;

import com.gcp.origin.api.feign.TestFeign;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestFeignController implements TestFeign{

    @Override
    public String getTest() {
        return "feign";
    }

}
