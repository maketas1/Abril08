package com.softtek.modelo.ejercicio1;

public class Pez extends Animal{
    private String especie;

    public Pez() {
    }

    public Pez(String especie) {
        this.especie = especie;
    }

    @Override
    public String comer() {
        return "Plankton";
    }

    @Override
    public String moverse() {
        return "Nadando";
    }

    @Override
    public String toString() {
        return "Pez{" +
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
