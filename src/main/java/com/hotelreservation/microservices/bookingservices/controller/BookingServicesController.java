package com.hotelreservation.microservices.bookingservices.controller;

import com.hotelreservation.microservices.bookingservices.entity.Room;
import com.hotelreservation.microservices.bookingservices.services.IBookingBusinessService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(value="bookingServices", description = "Data service operations on rooms", tags=("rooms"))
public class BookingServicesController {


    @Autowired
    private IBookingBusinessService bookingBusinessService;

    @RequestMapping(method= RequestMethod.GET, value = "/rooms")
    @ApiOperation(value="Get all rooms", notes="Gets all rooms in the system", nickname="getRooms")
    public ResponseEntity<List<Room>> findAll(){
        return new ResponseEntity<>(bookingBusinessService.findAll(), HttpStatus.OK);
    }

    @RequestMapping(method=RequestMethod.GET,value="/rooms/{roomNumber}")
    @ApiOperation(value="Get room by number", notes="Gets an specific number", nickname="getSpecificRoomNumber")
    public ResponseEntity<Room> findRoomByNumber(@PathVariable String roomNumber) {
        Room room = bookingBusinessService.getRoomByNumber(roomNumber);
        return new ResponseEntity<>(room, HttpStatus.OK);
    }




}
