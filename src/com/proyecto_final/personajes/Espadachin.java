package com.proyecto_final.personajes;

import com.proyecto_final.Jugador;

public class Espadachin extends Personaje{

    public Espadachin() {
        super("Espadachín",300,40,5,20);
    }

    @Override
    public float habilidad(Personaje objetivo) {
        float danio = this.poderAtaque*2;
        objetivo.danioRecibido(danio,false);
        return danio;
    }
}
