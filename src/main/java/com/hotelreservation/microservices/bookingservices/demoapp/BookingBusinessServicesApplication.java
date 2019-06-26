package com.hotelreservation.microservices.bookingservices.demoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableAutoConfiguration(exclude = RepositoryRestMvcAutoConfiguration.class)
@EntityScan("com.hotelreservation.microservices.bookingservices.entity")
@EnableJpaRepositories("com.hotelreservation.microservices.bookingservices.repository")
@ComponentScan({"com.hotelreservation.microservices.bookingservices.config", "com.hotelreservation.microservices.bookingservices.converter","com.hotelreservation.microservices.bookingservices.controller", "com.hotelreservation.microservices.bookingservices.services", "com.hotelreservation.microservices.bookingservices.services.impl","com.hotelreservation.microservices.bookingservices.vo"})
@EnableCaching
@EnableSwagger2
@EnableDiscoveryClient
public class BookingBusinessServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingBusinessServicesApplication.class, args);
	}


}
