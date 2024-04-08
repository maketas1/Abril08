package com.softtek.modelo.ejercicio1;

public class Perro extends Animal{
    private String raza;

    public Perro() {
    }

    public Perro(String raza) {
        this.raza = raza;
    }

    @Override
    public String comer() {
        return "Carne";
    }

    @Override
    public String moverse() {
        return "Mediante cuatro patas por tierra";
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                '}';
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
