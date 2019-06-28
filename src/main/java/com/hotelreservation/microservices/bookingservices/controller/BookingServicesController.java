package com.hotelreservation.microservices.bookingservices.controller;

import com.hotelreservation.microservices.bookingservices.exceptions.RoomNotFoundException;
import com.hotelreservation.microservices.bookingservices.services.IBookingBusinessService;
import com.hotelreservation.microservices.bookingservices.vo.RoomVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by e068635 on 6/25/2019.
 */
@RestController
public class BookingServicesController {


    @Autowired
    private IBookingBusinessService service;


    @RequestMapping(method= RequestMethod.GET, value = "/rooms")
    public ResponseEntity<List<RoomVO>> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @RequestMapping(method=RequestMethod.GET,value="/rooms/{roomNumber}")
    public ResponseEntity<RoomVO> findRoomByNumber(@PathVariable String roomNumber) {
        try {
            RoomVO roomVO = service.findByRoomNumber(roomNumber);
            return new ResponseEntity<>(roomVO, HttpStatus.OK);

        }catch(RoomNotFoundException roomNotFoundEx){
            return new ResponseEntity<> (HttpStatus.BAD_REQUEST);
        }


    }




}
