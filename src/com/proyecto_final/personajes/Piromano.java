package com.proyecto_final.personajes;

import java.util.ArrayList;

public class Piromano extends Personaje {


    public Piromano() {
        super("Piromano",230,30,5,28);
    }

    @Override
    public float habilidad(Personaje objetivo) {
        float danio=objetivo.vidaActual *.25f;
        objetivo.danioRecibido(danio,true);
        return danio;
    }
}
