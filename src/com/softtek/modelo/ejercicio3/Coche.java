package com.softtek.modelo.ejercicio3;

public class Coche extends IVehiculo{
    private int deposito;

    public Coche() {
    }

    public Coche(int deposito) {
        this.deposito = deposito;
    }

    @Override
    public boolean moverse() {
        if (deposito == 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "Coche{" +
                "deposito=" + deposito +
                '}';
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }
}
