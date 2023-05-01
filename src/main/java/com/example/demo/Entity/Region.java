package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter
@Entity
@Table(name = "regions")
public class Region {

    @Id
    @Column(name = "region_id")
    private BigDecimal regionId;


    @Column(name = "region_name")
    private String regionName;

}