package com.hedima.modelo;

import java.time.LocalDate;

public class Empleado {

    private String nombre;
    private double sueldo;
    private LocalDate fNacimiento;

    public Empleado()
    {

    }

    public Empleado(String nombre, double sueldo, LocalDate fNacimiento) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.fNacimiento = fNacimiento;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Sueldo: "+sueldo);
        System.out.println("Fecha de nacimiento: "+fNacimiento);
    }
}
