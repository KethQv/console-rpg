package com.proyecto_final.personajes;

public class Pistolero extends Personaje{

    public Pistolero() {
        super("Pistolero",140,45,5,20);
    }

    @Override
    public float habilidad(Personaje objetivo) {
        float danio=this.poderAtaque* 3f;
        objetivo.danioRecibido(danio,false);
        return danio;
    }
}
