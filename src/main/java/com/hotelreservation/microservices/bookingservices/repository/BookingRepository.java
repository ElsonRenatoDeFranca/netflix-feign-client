package com.hotelreservation.microservices.bookingservices.repository;

import com.hotelreservation.microservices.bookingservices.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by e068635 on 1/13/2020.
 */
public interface BookingRepository  extends JpaRepository<Guest, Long> {

}
