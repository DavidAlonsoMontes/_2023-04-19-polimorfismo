package com.hedima.presentacion;

import com.hedima.modelo.empresa.Empleado;
import com.hedima.modelo.empresa.Gerente;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Empleado e1 =new Gerente("David",30_000, LocalDate.of(1975,10,29),"Analisis de datos");
        System.out.println(e1.toString());
        Gerente g1= (Gerente) e1;

        System.out.println(g1.toString());
    }
}