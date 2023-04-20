package com.hedima.modelo.producto;

public abstract class Producto {
//Añado un identificador a cada producto
    protected int idProducto;
    protected String nombre;
    protected double pvp;

    public Producto() {
    }

    public Producto(String nombre, double pvp) {
        this.nombre = nombre;
        this.pvp = pvp;
    }
    public abstract double calcularIva();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPvp() {
        return pvp;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }
}
