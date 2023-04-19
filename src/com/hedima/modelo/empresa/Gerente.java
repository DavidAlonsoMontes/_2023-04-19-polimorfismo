package com.hedima.modelo.empresa;

import java.time.LocalDate;

public class Gerente extends Empleado{

    private String departamento;
    public Gerente(){
        super();
    }

    public Gerente(String nombre, double sueldo, LocalDate fNacimiento, String departamento) {
        super(nombre, sueldo, fNacimiento);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Departamento: "+departamento);
    }

   // @Override
    public String toString() {
        return super.toString()+" Gerente{" +
                "departamentos='" + departamento + '\'' +
                '}';
    }
}
