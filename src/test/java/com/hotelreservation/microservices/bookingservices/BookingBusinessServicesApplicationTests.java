package com.hotelreservation.microservices.bookingservices;

import com.hotelreservation.microservices.bookingservices.demoapp.BookingBusinessServicesApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BookingBusinessServicesApplication.class)
@WebAppConfiguration
public class BookingBusinessServicesApplicationTests {

	@Test
	public void contextLoads() {
	}

}
