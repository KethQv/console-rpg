package com.proyecto_final;

import com.proyecto_final.personajes.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
    private static final Scanner input = new Scanner(System.in);

    private static final Jugador jugador1 = new Jugador();
    private static final Jugador jugador2 = new Jugador();

    private static final ArrayList<Personaje> personajes = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
//        Pantalla.mostrarTitulo();

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

        seleccionarPersonaje(jugador1, 1);
        seleccionarPersonaje(jugador2, 2);
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

    public static void seleccionarPersonaje(Jugador jugador, int num) {
        do {
            int eleccion = Pantalla.mostrarSeleccion(num, personajes);

            if (eleccion < 0 || eleccion >= personajes.size()) {
                Pantalla.mostrarEleccionInvalida();
            } else {
                jugador.getPersonajes().add(personajes.get(eleccion));
                personajes.remove(eleccion);
            }

        } while (jugador.sinPersonajes());
    }
}
