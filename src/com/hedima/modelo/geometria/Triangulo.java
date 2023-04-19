package com.hedima.modelo.geometria;

public class Triangulo extends Figura{
        private double base;
        private double altura;

        public double calcularArea(){
                return (base*altura)/2;
        }

        @Override
        public String mostrarPosicion() {
                return super.mostrarPosicion() + "base " + base + " altura " + altura;
        }

        public Triangulo() {
        }

        public Triangulo(int x, int y, double base, double altura) {
                super(x, y);
                this.base = base;
                this.altura = altura;
        }

        public double getBase() {
                return base;
        }

        public void setBase(double base) {
                this.base = base;
        }

        public double getAltura() {
                return altura;
        }

        public void setAltura(double altura) {
                this.altura = altura;
        }
}