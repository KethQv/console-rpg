package com.proyecto_final.personajes;

import com.proyecto_final.Jugador;

public class Arquero extends Personaje{

    public Arquero() {
        super("Arquero",150,60,5,20);
    }



    @Override
    public float habilidad(Personaje objetivo) {
        float danio = this.poderAtaque*1.5f;
        objetivo.danioRecibido(danio, true);
        return danio;
    }
}
