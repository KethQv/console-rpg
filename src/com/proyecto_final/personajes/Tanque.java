package com.proyecto_final.personajes;

public class Tanque extends Personaje {

    public Tanque() {
        super("Tanque", 500, 25, 5, 38);
    }



    @Override
    public float habilidad(Personaje objetivo) {
        float aumentoReistencia=10;
        objetivo.setResistencia(objetivo.resistencia+= aumentoReistencia);
        return aumentoReistencia;

    }
}