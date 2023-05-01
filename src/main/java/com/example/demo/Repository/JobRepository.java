package com.example.demo.Repository;

import com.example.demo.DTO.Salario;
import com.example.demo.Entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<Job,Integer> {

    @Query(value = "select j.job_title as Puesto , j.max_salary  as SalarioMax , j.min_salary as SalarioMin,  " +
            " round(sum(e.salary),2) as SalarioTotal , round(avg(e.salary),2) as SalarioPromedio from jobs j "+
            " inner join employees e on j.job_id = e.job_id "+
            " group by j.job_title ", nativeQuery = true)
    List<Salario> reporteSalarios();
}
