package com.hedima.presentacion;

import com.hedima.modelo.instrumento.Bateria;
import com.hedima.modelo.instrumento.Flauta;
import com.hedima.modelo.instrumento.Guitarra;
import com.hedima.modelo.instrumento.InstrumentoMusical;

public class ProbarIntrumentos {

    public static void main(String[] args) {

        InstrumentoMusical ins1=new Guitarra();

        InstrumentoMusical ins2=new Bateria();

        InstrumentoMusical ins3=new Flauta();

        InstrumentoMusical[] instrumentos={ins1, ins2, ins3};
        for (InstrumentoMusical i:instrumentos) {
            i.emitirSonido();
        }

    }
}
