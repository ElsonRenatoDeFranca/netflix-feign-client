package com.hotelreservation.microservices.bookingservices.entity;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by e068635 on 1/13/2020.
 */

@Entity
@Table(name="BOOKING")
@Getter
@Setter
@EqualsAndHashCode
public class Booking {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private Long id;

    @Column(name="BOOKING_ID", length = 15)
    private Long bookingId;

    private Room room;

    private Guest guest;

    @Column(name="ARRIVAL_DATE")
    private Date arrivalDate;

    @Column(name="DEPARTURE_DATE")
    private Date departureDate;

}
