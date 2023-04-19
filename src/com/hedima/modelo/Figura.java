package com.hedima.modelo;

public class Figura {
    private int x;
    private int y;

    //1 CONSTRUCTORES

    public Figura() {
    }

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public double calcularArea()
    {
        //Calcula el area de la figura
        return 0.0;
    }

    public void mostrarPosicion()
    {
        System.out.println("("+getX()+","+getY()+")");
    }
}
