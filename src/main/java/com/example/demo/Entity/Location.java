package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "locations")
public class Location {


    @Id

    @Column(name = "location_id", nullable = false)
    private Integer location_id;

    @Column(name = "street_address")
    private String street_address;

    @Column(name = "postal_code")
    private String postal_code;


    @Column(name = "city")
    private String city;


    @Column(name = "state_province")
    private String state_province;

}