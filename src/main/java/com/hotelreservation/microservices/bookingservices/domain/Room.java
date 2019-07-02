package com.hotelreservation.microservices.bookingservices.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by e068635 on 6/6/2019.
 */
@Getter
@Setter
public class Room {
    private Long id;
    private String name;
    private String roomNumber;
    private String bedInfo;
}
