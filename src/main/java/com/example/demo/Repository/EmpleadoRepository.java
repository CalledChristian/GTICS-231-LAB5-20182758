package com.example.demo.Repository;

import com.example.demo.Entity.Empleado;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;

public interface EmpleadoRepository extends JpaRepository<Empleado,Integer> {
    @Query(value= "select * from employees where employee_id = ?1 ",nativeQuery = true)
    Empleado buscarEmpleadoPorId (Integer idEmpleado);

    @Modifying
    @Query(value = "insert into employees(first_name, last_name, email, password, hire_date, job_id, salary, manager_id, department_id, enabled) values (?1,?2,?3,?4,NOW(),?5,?6,?7,?8,1) ",nativeQuery = true)
    void nuevoEmpleado(String nombre, String apellido, String email, String contrasena, String idJob, BigDecimal sueldo, Integer idJefe, Integer idDepartamento );


    @Query(value = " select e.*, j.job_title, d.department_name, l.city from employees e "+
            "inner join jobs j on e.job_id = j.job_id "+
            "inner join departments d on e.department_id = d.department_id " +
            "inner join locations l on d.location_id = l.location_id "+
            "where e.first_name like %?1% or e.last_name like %?1% or "+
            "j.job_title like %?1%  or  l.city like %?1% ",nativeQuery = true)

    List<Empleado> buscarEmpleados(String texto);


    /*@Modifying
    @Query(value = "delete from employees where employee_id =4", nativeQuery = true)
    void  borrarEmpleado(Integer idEmpleado);*/
}
