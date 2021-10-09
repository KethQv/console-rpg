package com.proyecto_final.personajes;

import java.util.ArrayList;

public class Piromano extends Personaje {

    ArrayList<Personaje> quemando = new ArrayList<>();

    public Piromano() {
        super("Piromano",230,30,5,28);
    }

    @Override
    public float habilidad(Personaje objetivo) {
        objetivo.setQuemandose(3);
        quemando.add(objetivo);
        return 0;
    }

    public void quemar() {
        for (Personaje objetivo : quemando) {
            float quemadura = (objetivo.vidaActual * .05f) + 16;
            if (quemandose == 0) {
                quemando.remove(quemando);
            } else {
                objetivo.danioRecibido(quemadura, true);
                quemandose--;
                // aplicar danio de la quemadura
                // personaje.quemar();

                // restar 1 a los turnos
                // peronaje.setQuemandose(pesonaje.getQuemandose() - 1);
            }
        }

    }

    // cada turno:
    // piromano.quemar()
}
