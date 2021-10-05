package com.proyecto_final.personajes;

// TODO - Agregar javadoc
public abstract class Personaje {
    protected String nombre;
    protected float vidaMaxima;
    protected float vidaActual;
    protected float poderAtaque;
    protected float resistencia;
    protected int experiencia = 1;
    protected int puntosHabilidad;

    public Personaje(String nombre, float vidaMaxima, float poderAtaque, int puntosHabilidad, float resistencia) {
        this.nombre = nombre;
        this.vidaMaxima = vidaMaxima;
        this.vidaActual = vidaMaxima;
        this.poderAtaque = poderAtaque;
        this.puntosHabilidad = puntosHabilidad;
        this.resistencia = resistencia;
    }

    @Override
    public String toString() {
        int length = "╔══════════════════════════════════════════════════╗".length();
        String next = "║\n";
        String nombre = "║ ■ " + this.nombre;
        String vidaMaxima = "║ Vida maxima: " + this.vidaMaxima;
        String resistencia = "║ Resistencia: " + this.resistencia;
        String poderDeAtaque = "║ Poder de ataque: " + this.poderAtaque;
        String puntosDeHabilidad = "║ Puntos de habilidad: " + puntosHabilidad;
        return "" +
                "╔═══════════════════════════════════════════════════╗\n" +
                strAutoLenght(length, nombre, next) +
                strAutoLenght(length, vidaMaxima, next) +
                strAutoLenght(length, resistencia, next) +
                strAutoLenght(length, poderDeAtaque, next) +
                strAutoLenght(length, puntosDeHabilidad, next) +
                "╚═══════════════════════════════════════════════════╝";
    }

    private static String strAutoLenght(int lenght, String startString, String finalString) {
        return startString + " ".repeat(lenght - startString.length())+ finalString;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(float vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public float getVidaActual() {
        return vidaActual;
    }

    public void setVidaActual(float vidaActual) {
        this.vidaActual = vidaActual;
    }

    public float getPoderAtaque() {
        return poderAtaque;
    }

    public void setPoderAtaque(float poderAtaque) {
        this.poderAtaque = poderAtaque;
    }

    public float getResistencia() {
        return resistencia;
    }

    public void setResistencia(float resistencia) {
        this.resistencia = resistencia;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getPuntosHabilidad() {
        return puntosHabilidad;
    }

    public void setPuntosHabilidad(int puntosHabilidad) {
        this.puntosHabilidad = puntosHabilidad;
    }
}
