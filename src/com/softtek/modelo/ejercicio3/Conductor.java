package com.softtek.modelo.ejercicio3;

public class Conductor {
    private IVehiculo vehiculo;

    public Conductor() {
    }

    public Conductor(IVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public boolean conducir() {
        return vehiculo.moverse();
    }

    @Override
    public String toString() {
        return "Conductor{" +
                "vehiculo=" + vehiculo +
                '}';
    }

    public IVehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(IVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
