package com.proyecto_final;

import java.util.Scanner;

public class Juego {
    private final static Scanner input = new Scanner(System.in);

    private static Jugador jugador1;
    private static Jugador jugador2;

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

        seleccionarPersonaje(jugador1);
        seleccionarPersonaje(jugador2);

    }

    public static void seleccionarPersonaje(Jugador jugador) {

    }
}
