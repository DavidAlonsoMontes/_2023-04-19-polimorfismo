package com.hedima.modelo.producto;

public class ProductoLujo extends Producto{

    protected final double iva=0.21;
    private String material;

    public ProductoLujo() {
    }

    public ProductoLujo(String material) {
        this.material = material;
    }

    public ProductoLujo(String nombre, double pvp) {
        super(nombre, pvp);
    }

    public ProductoLujo(String nombre, double pvp, String material) {
        super(nombre, pvp);
        this.material = material;
    }

    @Override
    public double calcularIva() {
        return pvp*0.21;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
