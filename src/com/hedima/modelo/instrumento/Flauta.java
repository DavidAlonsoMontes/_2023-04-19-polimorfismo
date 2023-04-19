package com.hedima.modelo.instrumento;

public class Flauta extends InstrumentoMusical{

    private String tipoMaterial;

    public Flauta(){}

    @Override
    public void emitirSonido() {
        System.out.println("Sonido de flauta.....");
    }

    @Override
    public void afinar() {
        System.out.println("Estamos afinando la flauta");
    }
}
