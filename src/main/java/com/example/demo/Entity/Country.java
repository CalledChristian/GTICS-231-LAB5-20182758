package com.example.demo.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "countries")
public class Country {

    @Id
    @Column(name = "country_id")
    private String countryId;


    @Column(name = "country_name")
    private String countryName;

    @ManyToOne
    @JoinColumn (name = "region_id")
    private Region region;

}