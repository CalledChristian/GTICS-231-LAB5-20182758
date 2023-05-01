package com.example.demo.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Timestamp;



@Embeddable
@Getter
@Setter
public class JobHistoryId implements Serializable {

    @Column(name = "job_history_id",nullable = false)
    private Integer jobHistoryId;

    @Column(name = "employee_id",nullable = false)
    private Integer employeeId;
    //private Empleado empleado;

    @Column(name = "start_date",nullable = false)
    private Timestamp startDate;

}




