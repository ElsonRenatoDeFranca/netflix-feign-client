package com.hotelreservation.microservices.bookingservices.services.impl;

import com.hotelreservation.microservices.bookingservices.client.IRoomRemoteService;
import com.hotelreservation.microservices.bookingservices.exceptions.RoomNotFoundException;
import com.hotelreservation.microservices.bookingservices.services.IBookingBusinessService;
import com.hotelreservation.microservices.bookingservices.vo.RoomVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by e068635 on 6/28/2019.
 */
public class BookingBusinessServiceImpl implements IBookingBusinessService {

    @Autowired
    private IRoomRemoteService roomRemoteService;


    @Override
    public List<RoomVO> findAll(){
        return this.roomRemoteService.findAll().getBody();
    }

    @Override
    public RoomVO findByRoomNumber(String roomNumber) throws RoomNotFoundException {
        return this.roomRemoteService.retrieveRoomByNumber(roomNumber).getBody();
    }

}
