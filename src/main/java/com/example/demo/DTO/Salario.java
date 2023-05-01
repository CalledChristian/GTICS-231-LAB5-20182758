package com.example.demo.DTO;

import java.math.BigDecimal;

public interface Salario {

    String getPuesto();
    Integer getSalarioMax();
    Integer getSalarioMin();
    BigDecimal getSalarioTotal();
    BigDecimal getSalarioPromedio();
}
