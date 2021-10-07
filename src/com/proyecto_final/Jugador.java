package com.proyecto_final;
import com.proyecto_final.personajes.Personaje;

public class Jugador {
    protected Personaje[] personajes = {null, null, null};
    protected Personaje personajeActual;

    public Jugador(Personaje personaje1, Personaje personaje2, Personaje personaje3) {
        personajes[0] = personaje1;
        personajes[1] = personaje2;
        personajes[2] = personaje3;
    }


    public boolean haPerdido() {
        if (personajes[0].getVidaActual() == 0 && personajes[1].getVidaActual() == 0 && personajes[0].getVidaActual() == 0) {
            return false;
        }
        return true;
    }

    private void cambiarDePersonaje(int opcionCambio) {
        switch (opcionCambio) {
            case 1:{
                if (personajes[0].getVidaActual() != 0) {
                    personajeActual = personajes[0];
                }
                break;
            }
            case 2: {
                if (personajes[1].getVidaActual() != 0) {
                    personajeActual = personajes[1];
                }
                break;
            }
            case 3: {
                if (personajes[2].getVidaActual() != 0) {
                    personajeActual = personajes[2];
                }
                break;
            }
        }
    }

    public  void actualizarPersonaje() {
        for (int i = 0; i<3; i++) {
            if (personajeActual.getNombre().equals(personajes[i].getNombre())) {
                personajes[i] = personajeActual;
            }
        }
    }
}