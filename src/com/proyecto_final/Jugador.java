package com.proyecto_final;
import com.proyecto_final.personajes.Personaje;

import java.util.ArrayList;

public class Jugador {

    protected String nombre;
    protected ArrayList<Personaje> personajes = new ArrayList<>();
    protected Personaje personajeActual;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public boolean haPerdido() {
        for (Personaje personaje : personajes) {
            if (personaje.estaVivo()) return false;
        }
        return true;
    }

    public boolean sinPersonajes() {
        return personajes.size() < 3;
    }

    public ArrayList<Personaje> getPersonajesVivos() {
        ArrayList<Personaje> personajesVivos = new ArrayList<>();

        for (Personaje personaje : personajes) {
            if (personaje.estaVivo()) personajesVivos.add(personaje);
        }
        return personajesVivos;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}