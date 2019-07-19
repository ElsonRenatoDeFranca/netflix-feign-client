package com.hotelreservation.microservices.bookingservices.client.impl;

import com.hotelreservation.microservices.bookingservices.client.IGuestRemoteService;
import com.hotelreservation.microservices.bookingservices.exceptions.GuestNotFoundException;
import com.hotelreservation.microservices.bookingservices.vo.GuestVO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collections;
import java.util.List;

/**
 * Created by e068635 on 7/19/2019.
 */
@Service
public class GuestRemoteServiceFallback implements IGuestRemoteService {


    @Override
    public ResponseEntity<List<GuestVO>> findAll() {
        return ResponseEntity.ok(Collections.EMPTY_LIST);
    }

    @Override
    public ResponseEntity<GuestVO> retrieveGuestById(@PathVariable String guestId) throws GuestNotFoundException {
        GuestVO guestVO = new GuestVO();
        guestVO.setState("Parana");
        guestVO.setAddress("Joao Marchesini street, 139");
        guestVO.setCountry("Brazil");
        guestVO.setState("Parana");
        guestVO.setEmailAddress("employee@company.com");
        guestVO.setFirstName("Employee First Name");
        guestVO.setLastName("Employee Last Name");
        guestVO.setPhoneNumber("+55 41 999996655");
        guestVO.setGuestId(1L);

        return ResponseEntity.ok(guestVO);
    }

}
