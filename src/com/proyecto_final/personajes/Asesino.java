package com.proyecto_final.personajes;

import com.proyecto_final.Jugador;

public class Asesino extends Personaje{

    public Asesino() {
        super("Asesino",250,55,3,15);
    }

    public void ejecutar() {

    }

    @Override
    public float habilidad(Personaje objetivo) {
        float danio=0;
        double probabilidad = Math.random()*1;
        if (objetivo.getVidaActual()<=objetivo.getVidaMaxima()*.25){
            if(probabilidad>.3){
                danio=999;
                objetivo.danioRecibido(danio,true);
                return danio;
            } else{
                objetivo.danioRecibido(danio,false);
            }
        }
        return danio;
    }
}
