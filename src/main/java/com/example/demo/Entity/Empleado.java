package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "employees")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id", nullable = false)
    private Integer idEmpleado;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name", nullable = false)
    private String last_name;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "phone_number")
    private String phone_number;


    @Column(name = "hire_date")
    private Timestamp hire_date;

    @ManyToOne
    @JoinColumn(name = "job_id", nullable = false)
    private Job job;

    @Column(name = "salary")
    private BigDecimal salary;

    @Column(name = "commission_pct")
    private BigDecimal commission_pct;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Empleado manager;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Departamento departamento;

    @Column(name = "enabled")
    private Integer enabled;




}
