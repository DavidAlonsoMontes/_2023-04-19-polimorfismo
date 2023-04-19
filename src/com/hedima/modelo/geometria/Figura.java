package com.hedima.modelo.geometria;

public abstract class Figura {
    private int x;
    private int y;

    public String mostrarPosicion(){
        return "(" + x + "," + y + ")";
    }

    public abstract double calcularArea();

    public Figura() {
    }

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}