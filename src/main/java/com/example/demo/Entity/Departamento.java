package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "departments")
public class Departamento {


    @Id
    @Column(name = "department_id", nullable = false)
    private Integer department_id;

    @Column(name = "department_name")
    private String department_name;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Empleado manager;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

}