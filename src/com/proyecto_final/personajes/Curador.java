package com.proyecto_final.personajes;
import com.proyecto_final.Jugador;

public class Curador extends  Personaje{

    public Curador() {
        super("Curador",300,40,10,25);
    }

    public void curar() {

    }

    @Override
    public float habilidad(Personaje objetivo) {
        float curacion=poderAtaque * 2.3f;
        objetivo.setVidaActual(objetivo.vidaActual+= curacion);
        return curacion;
    }
}
