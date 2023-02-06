package com.assaf.serviceproviderapp;

import com.assaf.serviceproviderapp.config.RsaProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(RsaProperties.class)
@SpringBootApplication
public class ServiceProviderAppApplication {


    public static void main(String[] args) {
        SpringApplication.run(ServiceProviderAppApplication.class, args);
    }

}
