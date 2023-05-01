package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "jobs")
public class Job {

    @Id
    @Column(name = "job_id", nullable = false)
    private String job_id;

    @Column(name = "job_title")
    private String job_title;

    @Column(name = "min_salary")
    private Integer min_salary;

    @Column(name = "max_salary")
    private Integer max_salary;

}