package com.hotelreservation.microservices.bookingservices.services.impl;

import com.hotelreservation.microservices.bookingservices.config.RestTemplateConfig;
import com.hotelreservation.microservices.bookingservices.entity.Room;
import com.hotelreservation.microservices.bookingservices.services.IBookingBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by e068635 on 6/25/2019.
 */
@Service
public class BookingBusinessServiceImpl implements IBookingBusinessService {

    @Autowired
    private RestTemplateConfig restTemplateConfig;

    @Value("${rooms.microservice.findall.url}")
    private String allRoomsUrl;

    @Value("${rooms.microservice.findone.url}")
    private String onlyOneRoomUrl;


    @Override
    public List<Room> findAll(){
        ResponseEntity<List<Room>> response = this.restTemplateConfig.getRestTemplate().exchange(allRoomsUrl, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Room>>() {});
        return response.getBody();
    }

    @Override
    public Room getRoomByNumber(String roomNumber) {
        ResponseEntity<Room> responseEntity = this.restTemplateConfig.getRestTemplate().exchange(onlyOneRoomUrl + roomNumber, HttpMethod.GET, new HttpEntity<>(new HttpHeaders()), Room.class);
        Room RoomResult = responseEntity.getBody();
        return RoomResult;
    }


}
