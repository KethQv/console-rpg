package com.proyecto_final;

import com.proyecto_final.personajes.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
    private static final Scanner input = new Scanner(System.in);

    private static final Jugador jugador1 = new Jugador("JUGADOR 1");
    private static final Jugador jugador2 = new Jugador("JUGADOR 2");

    private static final ArrayList<Personaje> personajes = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        Pantalla.mostrarTitulo();

        boolean seguir = true;
        do {
            switch (Pantalla.mostrarMenu()) {
                case 1 -> comenzarJuego();
                case 2 -> Pantalla.mostrarCreditos();
                case 3 -> seguir = false;
                default -> System.out.println("Elige una opcion valida.");

            }
        } while (seguir);
    }

    public static void comenzarJuego() {
        Pantalla.mostrarInstrucciones();

        inicializarPersonajes();

        seleccionarPersonaje(jugador1);
        seleccionarPersonaje(jugador2);

        while (true) {
            jugarTurno(jugador1, jugador2);
            if (jugador2.haPerdido()) {
//                Pantalla.mostrarGanador("Jugador 1");
                return;
            }
            jugarTurno(jugador2, jugador1);
            if (jugador1.haPerdido()) {
//                Pantalla.mostrarGanador("Jugador 2");
                return;
            }
        }
    }

    public static void inicializarPersonajes() {
        personajes.add(new Arquero());
        personajes.add(new Asesino());
        personajes.add(new Curador());
        personajes.add(new Espadachin());
        personajes.add(new Mago());
        personajes.add(new Piromano());
        personajes.add(new Pistolero());
        personajes.add(new Tanque());
    }

    public static void seleccionarPersonaje(Jugador jugador) {
        do {
            int eleccion = Pantalla.mostrarSeleccion(jugador, personajes);

            if (eleccion < 0 || eleccion >= personajes.size()) {
                Pantalla.mostrarEleccionInvalida();
            } else {
                jugador.getPersonajes().add(personajes.get(eleccion));
                personajes.remove(eleccion);
            }

        } while (jugador.sinPersonajes());
        jugador.setPersonajeActual(jugador.getPersonajes().get(0));
    }

    public static void jugarTurno(Jugador jugador, Jugador jugadorEnemigo) {
        Personaje personajeAct = jugador.getPersonajeActual();
        Personaje personajeEnemigo = jugadorEnemigo.getPersonajeActual();

        boolean seguir;
        do {
            seguir = false;

            int eleccion = Pantalla.mostrarTurno(jugador);
            switch (eleccion) {
                case 1 -> personajeAct.atacar(personajeEnemigo);
                case 2 -> personajeAct.habilidad(personajeEnemigo);
                case 3 -> cambiarDePersonaje(jugador);
                case 4 -> {
                    Pantalla.mostrarEstadisticas(personajeAct);
                    seguir = true;
                }
            }
        } while (seguir);
    }

    public static void cambiarDePersonaje(Jugador jugador) {
        int eleccion = Pantalla.mostrarCambioPersonajes(jugador);
        input.nextLine();
    }
}
