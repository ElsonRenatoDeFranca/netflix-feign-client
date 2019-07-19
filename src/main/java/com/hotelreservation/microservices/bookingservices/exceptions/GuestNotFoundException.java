package com.hotelreservation.microservices.bookingservices.exceptions;

/**
 * Created by e068635 on 7/19/2019.
 */
public class GuestNotFoundException extends Exception {

    private static final long serialVersionUID = 7837988622143245128L;

    public GuestNotFoundException(String message) {
        super(message);
    }

}
