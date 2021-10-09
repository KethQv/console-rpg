package com.proyecto_final.personajes;

import com.proyecto_final.Util;

public abstract class Personaje {
    protected String nombre;
    protected float vidaMaxima;
    protected float vidaActual;
    protected float poderAtaque;
    protected float resistencia;
    protected int experiencia = 1;
    protected int puntosHabilidad;
    protected  int quemandose =0;
    public Personaje(String nombre, float vidaMaxima, float poderAtaque, int puntosHabilidad, float resistencia) {
        this.nombre = nombre;
        this.vidaMaxima = vidaMaxima;
        this.vidaActual = vidaMaxima;
        this.poderAtaque = poderAtaque;
        this.puntosHabilidad = puntosHabilidad;
        this.resistencia = resistencia;
    }

    public float atacar(Personaje objetivo) {
        float danio = poderAtaque * 1.5f;
        objetivo.danioRecibido(poderAtaque, false);
        return danio;
    }

    public float danioRecibido(float danio, boolean esVerdadero) {
        float danioRecibido = danio;
        if (esVerdadero) {
            this.vidaActual -= danio;
            return danioRecibido;
        } else{
            float reduccion = (this.resistencia * .5f) / 100;
            danioRecibido = danio * reduccion;
            this.vidaActual -= danioRecibido;
            return danioRecibido;
        }
    }

    public abstract float habilidad(Personaje objetivo);

    @Override
    public String toString() {
        int length = "╔═══════════════════════════════════════════════════════════════════════════════╗".length();
        String next = "║\n";
        String nombre = "║    ■ " + this.nombre;
        String vidaMaxima = "║    Vida maxima: " + this.vidaMaxima;
        String resistencia = "║    Resistencia: " + this.resistencia;
        String poderDeAtaque = "║    Poder de ataque: " + this.poderAtaque;
        String puntosDeHabilidad = "║    Puntos de habilidad: " + puntosHabilidad;
        return "" +
                """
                ╔═══════════════════════════════════════════════════════════════════════════════╗
                ║                                                                               ║\n""" +
                Util.strAutoLenght(length, nombre, next) +
                """
                ║                                                                               ║
                ║                                                                               ║\n""" +
                Util.strAutoLenght(length, vidaMaxima, next) +
                Util.strAutoLenght(length, resistencia, next) +
                Util.strAutoLenght(length, poderDeAtaque, next) +
                Util.strAutoLenght(length, puntosDeHabilidad, next) +
                """
                ║                                                                               ║
                ╚═══════════════════════════════════════════════════════════════════════════════╝""";
    }

    public boolean estaVivo() {
        return vidaActual > 0;
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

    public int getQuemandose() {
        return quemandose;
    }

    public void setQuemandose(int quemandose) {
        this.quemandose = quemandose;
    }
}
