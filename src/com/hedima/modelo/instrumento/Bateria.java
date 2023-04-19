package com.hedima.modelo.instrumento;

public class Bateria extends InstrumentoMusical{

    private int numPlatillos;

    public Bateria()
    {}
    public void emitirSonido(){
        System.out.println("Sonido de bateria...");
    }

    @Override
    public void afinar() {
        System.out.println("Estamos afinando la bateria");
    }
}
