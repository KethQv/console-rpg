package com.proyecto_final.personajes;
import com.proyecto_final.Jugador;

public class Ogro extends  Personaje{

    public Ogro() {
        super("Ogro",300,40,10,25);
    }

    public void curar() {

    }

    @Override
    public float habilidad(Personaje objetivo) {
        float danio=(poderAtaque * 1.5f)+30f;
        objetivo.danioRecibido(danio,false);
        return danio;
    }
}
