package com.example.demo.Controller;


import com.example.demo.Repository.EmpleadoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping(value = "/empleados")



public class EmpleadoController {



    final EmpleadoRepository empleadoRepository;

    public EmpleadoController(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

        @GetMapping(value = "/")
    public String empleados(Model model) {
        model.addAttribute("listaempleados",empleadoRepository.findAll());
        return "empleados/listaempleados";
    }

    /*@GetMapping(value = "/registro")
    public String registro() {

        return "pages-register";
    }

    @GetMapping(value = "/olvidocontra")
    public String olvidoContra() {

        return "olvidocontra";
    }

    @GetMapping(value = "/formRegistro")
    public String formRegistro() {

        return "formularioregistro";
    }*/
}