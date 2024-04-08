package com.softtek.modelo.ejercicio4;

public class SeguroCoche {
    private Italler taller;
    private String aseguradora;

    public SeguroCoche() {
    }

    public SeguroCoche(Italler taller, String aseguradora) {
        this.taller = taller;
        this.aseguradora = aseguradora;
    }

    public String reparar(Coche coche) {
        return "A reparar " + coche.toString();
    }
}
