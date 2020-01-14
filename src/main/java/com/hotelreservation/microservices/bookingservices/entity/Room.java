package com.hotelreservation.microservices.bookingservices.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by e068635 on 6/6/2019.
 */
@Entity
@Table(name="ROOM")
@Getter
@Setter
public class Room {


    @Id
    @Column(name="ROOM_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private Long roomId;

    @Column(name ="ROOM_NUMBER", length = 10)
    private String roomNumber;

    @Column(name = "BED_INFO", length = 20)
    private String bedInfo;

    @JsonIgnore
    @ManyToMany(mappedBy = "rooms")
    private List<Guest> guests = new ArrayList();


}
