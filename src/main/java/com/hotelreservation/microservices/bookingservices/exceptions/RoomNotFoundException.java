package com.hotelreservation.microservices.bookingservices.exceptions;

public class RoomNotFoundException extends Exception{

    private static final long serialVersionUID = 7837878512143245128L;

    public RoomNotFoundException(String message) {
        super(message);
    }

}






