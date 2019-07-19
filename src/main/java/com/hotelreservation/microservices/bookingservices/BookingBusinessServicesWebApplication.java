package com.hotelreservation.microservices.bookingservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;



@SpringBootApplication
@EnableFeignClients
public class BookingBusinessServicesWebApplication {
	public static void main(String[] args) {
		SpringApplication.run(BookingBusinessServicesWebApplication.class, args);
	}
}
