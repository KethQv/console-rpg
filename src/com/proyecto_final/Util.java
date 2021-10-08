package com.proyecto_final;

import java.util.Scanner;

public class Util {
    private final static Scanner input = new Scanner(System.in);

    public static void limpiarConsola() {
        for (int i = 0; i < 50; i++) System.out.println();
    }

    public static String strAutoLenght(int lenght, String startString, String finalString) {
        return startString + " ".repeat(lenght - startString.length() - 1)+ finalString;
    }
}
