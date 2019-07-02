package com.hotelreservation.microservices.bookingservices.client.impl;

import com.hotelreservation.microservices.bookingservices.client.IRoomRemoteService;
import com.hotelreservation.microservices.bookingservices.exceptions.RoomNotFoundException;
import com.hotelreservation.microservices.bookingservices.vo.RoomVO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by e068635 on 7/2/2019.
 */
@Service
public class RoomRemoteServiceFallback implements IRoomRemoteService {
    @Override
    public ResponseEntity<List<RoomVO>> findAll() {
        return ResponseEntity.ok(Collections.EMPTY_LIST);
    }

    @Override
    public ResponseEntity<RoomVO> retrieveRoomByNumber(@PathVariable String roomNumber) throws RoomNotFoundException {
        return ResponseEntity.ok(new RoomVO());
    }
}
