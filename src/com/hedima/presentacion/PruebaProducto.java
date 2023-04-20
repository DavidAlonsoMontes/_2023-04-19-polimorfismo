package com.hedima.presentacion;

import com.hedima.modelo.producto.Producto;
import com.hedima.modelo.producto.Producto1Necesidad;
import com.hedima.modelo.producto.ProductoLujo;

public class PruebaProducto {
    public static void main(String[] args) {

        Producto p1=new Producto1Necesidad("Manzana", 1.56, "Alimento");
        Producto p2=new Producto1Necesidad("Pera", 1.86, "Alimento");
        Producto p3=new Producto1Necesidad("Leche", 4.06, "Alimento");

        Producto p4=new ProductoLujo("Coche", 30000.59, "Metalico");
        Producto p5=new ProductoLujo("Bolso", 45.99, "Cuero");
        Producto p6=new ProductoLujo("Gafas de sol", 100.00, "Vidrio");

        Producto[] productos={p1,p2,p3,p4,p5,p6};
        for (Producto p:productos) {

            System.out.println(p.calcularIva());
        }

    }
}
