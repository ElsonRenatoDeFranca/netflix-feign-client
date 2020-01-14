package com.hotelreservation.microservices.bookingservices.services.impl;

import com.hotelreservation.microservices.bookingservices.client.IGuestRemoteService;
import com.hotelreservation.microservices.bookingservices.client.IRoomRemoteService;
import com.hotelreservation.microservices.bookingservices.exceptions.RoomNotFoundException;
import com.hotelreservation.microservices.bookingservices.services.IBookingBusinessService;
import com.hotelreservation.microservices.bookingservices.vo.GuestVO;
import com.hotelreservation.microservices.bookingservices.vo.RoomVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by e068635 on 6/25/2019.
 */
@Service
public class BookingBusinessServiceImpl implements IBookingBusinessService{

    @Autowired
    private IRoomRemoteService roomRemoteService;

    @Autowired
    private IGuestRemoteService guestRemoteService;

    @Override
    public void checkIn(){
        List<RoomVO> rooms = roomRemoteService.findAll().getBody();
        List<GuestVO> guests = guestRemoteService.findAll().getBody();

    }

    @Override
    public void checkOut() {

    }


   

}
