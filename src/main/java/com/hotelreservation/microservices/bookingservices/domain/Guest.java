package com.hotelreservation.microservices.bookingservices.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by e068635 on 7/19/2019.
 */
@Getter
@Setter
public class Guest{
    private Long id;
    private Long guestId;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String address;
    private String state;
    private String country;
    private String phoneNumber;
}
