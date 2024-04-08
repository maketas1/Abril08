package com.softtek.modelo.ejercicio1;

public class Gusano extends Animal{
    private String especie;

    public Gusano() {
    }

    public Gusano(String especie) {
        this.especie = especie;
    }

    @Override
    public String comer() {
        return "Hojas";
    }

    @Override
    public String moverse() {
        return "Arrastrandose por el suelo";
    }

    @Override
    public String toString() {
        return "Gusano{" +
                "especie='" + especie + '\'' +
                '}';
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
