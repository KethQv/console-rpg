package com.proyecto_final;
import com.proyecto_final.personajes.Personaje;

import java.util.ArrayList;

public class Jugador {
    protected ArrayList<Personaje> personajes = new ArrayList<>();
    protected Personaje personajeActual;

    public Jugador() {}

    public boolean haPerdido() {
        for (Personaje personaje : personajes) {
            if (personaje.estaVivo()) return false;
        }
        return true;
    }

//    private void cambiarDePersonaje(int opcionCambio) {
//        switch (opcionCambio) {
//            case 1 -> {
//                if (personajes[0].getVidaActual() != 0) {
//                    personajeActual = personajes[0];
//                }
//            }
//            case 2 -> {
//                if (personajes[1].getVidaActual() != 0) {
//                    personajeActual = personajes[1];
//                }
//            }
//            case 3 -> {
//                if (personajes[2].getVidaActual() != 0) {
//                    personajeActual = personajes[2];
//                }
//            }
//        }
//    }
//
//    public  void actualizarPersonaje() {
//        for (int i = 0; i<3; i++) {
//            if (personajeActual.getNombre().equals(personajes[i].getNombre())) {
//                personajes[i] = personajeActual;
//            }
//        }
//    }

    public  boolean sinPersonajes() {
        return personajes.size() < 3;
    }

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(ArrayList<Personaje> personajes) {
        this.personajes = personajes;
    }

    public Personaje getPersonajeActual() {
        return personajeActual;
    }

    public void setPersonajeActual(Personaje personajeActual) {
        this.personajeActual = personajeActual;
    }
}