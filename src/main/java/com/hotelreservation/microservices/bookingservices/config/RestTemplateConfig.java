package com.hotelreservation.microservices.bookingservices.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.client.RestTemplate;

/**
 * Created by e068635 on 6/25/2019.
 */
@Configuration
@PropertySource("classpath:config/config.properties")
public class RestTemplateConfig {

    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
