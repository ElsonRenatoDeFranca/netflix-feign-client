package com.hotelreservation.microservices.bookingservices.client;

import com.hotelreservation.microservices.bookingservices.client.impl.RoomRemoteServiceFallback;
import com.hotelreservation.microservices.bookingservices.exceptions.RoomNotFoundException;
import com.hotelreservation.microservices.bookingservices.vo.RoomVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by e068635 on 6/26/2019.
 */
@FeignClient(value="ROOMSERVICES", fallback = RoomRemoteServiceFallback.class)
public interface IRoomRemoteService {

    @RequestMapping(method= RequestMethod.GET, value = "api/rooms")
    ResponseEntity<List<RoomVO>> findAll();


    @RequestMapping(method=RequestMethod.GET,value="/api/rooms/{roomNumber}")
    ResponseEntity<RoomVO> retrieveRoomByNumber(@PathVariable String roomNumber)throws RoomNotFoundException;

}
