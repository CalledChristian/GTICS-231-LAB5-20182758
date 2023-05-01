package com.example.demo.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@Table(name = "job_history")
public class JobHistory {

    @EmbeddedId
    private JobHistoryId id;

    /*@MapsId("jobHistoryId")
    @Column(name = "job_history_id")
    private Integer jobHistoryId;*/

    @MapsId("employeeId")
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Empleado empleado;

    /*@MapsId("startDate")
    @Column(name = "start_date")
    private Timestamp startDate; */

    @Column(name = "end_date")
    private Timestamp endDate;

    @ManyToOne
    @JoinColumn(name = "job_id",nullable = false)
    private Job job;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Departamento departamento;


}
