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
        return taller.reparar();
    }

    public Italler getTaller() {
        return taller;
    }

    public void setTaller(Italler taller) {
        this.taller = taller;
    }

    public String getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(String aseguradora) {
        this.aseguradora = aseguradora;
    }
}
