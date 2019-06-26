package com.hotelreservation.microservices.bookingservices.services;

import com.hotelreservation.microservices.bookingservices.entity.Room;

import java.util.List;

/**
 * Created by e068635 on 6/25/2019.
 */
public interface IBookingBusinessService {

    List<Room> findAll();

    Room getRoomByNumber(String roomNumber);
}
