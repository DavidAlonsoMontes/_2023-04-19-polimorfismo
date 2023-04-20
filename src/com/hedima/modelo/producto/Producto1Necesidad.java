package com.hedima.modelo.producto;

public class Producto1Necesidad extends Producto{

    protected final double iva=0.04;
    private String tipo;

    public Producto1Necesidad() {
    }

    public Producto1Necesidad(String tipo) {
        this.tipo = tipo;
    }

    public Producto1Necesidad(String nombre, double pvp, String tipo) {
        super(nombre, pvp);
        this.tipo = tipo;
    }

    @Override
    public double calcularIva() {
        return pvp*iva;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
