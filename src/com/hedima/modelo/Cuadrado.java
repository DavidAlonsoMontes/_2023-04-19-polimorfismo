package com.hedima.modelo;


public class Cuadrado extends  Figura{

    private double lado;

    public Cuadrado(lado){
        this.lado=lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }
}
