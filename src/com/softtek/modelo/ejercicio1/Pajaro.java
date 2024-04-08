package com.softtek.modelo.ejercicio1;

public class Pajaro extends Animal{
    private String especie;

    public Pajaro() {
    }

    public Pajaro(String especie) {
        this.especie = especie;
    }

    @Override
    public String comer() {
        return "Otros animales como gusanos o conejos";
    }

    @Override
    public String moverse() {
        return "Por aire";
    }

    @Override
    public String toString() {
        return "Pajaro{" +
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
