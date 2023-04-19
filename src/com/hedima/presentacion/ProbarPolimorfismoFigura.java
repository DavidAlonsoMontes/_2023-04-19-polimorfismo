package com.hedima.presentacion;

import com.hedima.modelo.geometria.Cuadrado;
import com.hedima.modelo.geometria.Figura;
import com.hedima.modelo.geometria.Triangulo;

public class ProbarPolimorfismoFigura {
    public static void main(String[] args) {


        Figura f1 = new Triangulo(4,4,3,5);
        System.out.println("Desde f1 sólo se ven los atributos de Figura x :" + f1.getX() + " y " + f1.getY() );
        Triangulo t1 = (Triangulo) f1;
        System.out.println("Desde t1 se ven todos los atributos de triangulo  x :" + t1.getX() + " y " + t1.getY() + " base " + t1.getBase() + " altura " + t1.getAltura());
        //System.out.println(f1.mostrarPosicion());
       // System.out.println(t1.mostrarPosicion());


        Figura f2=new Cuadrado(0,0,5);

        Cuadrado c1 = (Cuadrado) f2;
       // System.out.println(c1.calcularArea());

        //System.out.println(f1);

        Figura[] arrayFiguras= {f1,f2};

        for (Figura f:arrayFiguras) {

            System.out.println(f.mostrarPosicion()+" Area: "+f.calcularArea());

        }
    }
}
