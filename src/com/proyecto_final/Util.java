package com.proyecto_final;

public class Util {
    public static void limpiarConsola() {
        for (int i = 0; i < 50; i++) System.out.println();
    }

    public static String strAutoLenght(int lenght, String startString, String finalString) {
        return startString + " ".repeat(lenght - startString.length())+ finalString;
    }
}
