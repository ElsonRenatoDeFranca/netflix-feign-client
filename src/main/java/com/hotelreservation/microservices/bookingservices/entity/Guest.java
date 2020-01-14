package com.hotelreservation.microservices.bookingservices.entity;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by e068635 on 6/7/2019.
 */


@Entity
@Table(name="GUEST")
@Getter
@Setter
@EqualsAndHashCode
public class Guest {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private Long id;

    @Column(name="GUEST_ID", length = 10)
    private Long guestId;

    @Column(name="FIRST_NAME", length = 30)
    private String firstName;

    @Column(name="LAST_NAME", length = 30)
    private String lastName;

    @Column(name="EMAIL", length = 30)
    private String emailAddress;


    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })

    @JoinTable(name = "BOOKING",
            joinColumns = { @JoinColumn(name = "GUEST_ID") },
            inverseJoinColumns = { @JoinColumn(name = "ROOM_ID") })
    private List<Room> rooms;

}
