package com.hotelreservation.microservices.bookingservices.services;

import com.hotelreservation.microservices.bookingservices.exceptions.RoomNotFoundException;
import com.hotelreservation.microservices.bookingservices.vo.RoomVO;

import java.util.List;

/**
 * Created by e068635 on 6/28/2019.
 */
public interface IBookingBusinessService {

    List<RoomVO> findAll();

    RoomVO findByRoomNumber(String roomNumber)  throws RoomNotFoundException;
}
