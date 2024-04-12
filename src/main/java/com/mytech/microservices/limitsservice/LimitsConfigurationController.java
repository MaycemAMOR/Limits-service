package com.mytech.microservices.limitsservice;

import com.mytech.microservices.limitsservice.bean.LimitsConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitsConfiguration retrieveLimitsFromConfigurations() {
        return new LimitsConfiguration(configuration.getMaximum(), configuration.getMinimum());

    }
}
