package com.proyecto_final.personajes;

public class Mago extends Personaje{

    public Mago() {
        super("Mago",350,40,5,25);
    }

    public void explosion() {

    }

    @Override
    public float habilidad(Personaje objetivo) {
        float danio=objetivo.getVidaActual()* .25f;
        objetivo.danioRecibido(danio,false);
        return danio;
    }
}
