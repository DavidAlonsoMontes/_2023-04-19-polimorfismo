package com.hedima.modelo.instrumento;

public class Guitarra extends InstrumentoMusical{
    private String tipoCuerda;

    public Guitarra(){

    }


    public void emitirSonido(){
        System.out.println("Sonido de guitarra....");
    }

    @Override
    public void afinar() {

    }
}
