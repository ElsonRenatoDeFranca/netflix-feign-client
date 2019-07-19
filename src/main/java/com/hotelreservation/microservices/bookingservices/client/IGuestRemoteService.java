package com.hotelreservation.microservices.bookingservices.client;

import com.hotelreservation.microservices.bookingservices.client.impl.GuestRemoteServiceFallback;
import com.hotelreservation.microservices.bookingservices.exceptions.GuestNotFoundException;
import com.hotelreservation.microservices.bookingservices.vo.GuestVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


/**
 * Created by e068635 on 7/19/2019.
 */
@FeignClient(value="GUESTSERVICES", fallback = GuestRemoteServiceFallback.class)
public interface IGuestRemoteService {

    @RequestMapping(method= RequestMethod.GET, value = "api/guests")
    ResponseEntity<List<GuestVO>> findAll();


    @RequestMapping(method=RequestMethod.GET,value="/api/guests/{guestId}")
    ResponseEntity<GuestVO> retrieveGuestById(@PathVariable String guestId)throws GuestNotFoundException;

}
