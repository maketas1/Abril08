package com.softtek.presentacion;

import com.softtek.modelo.ejercicio3.Coche;
import com.softtek.modelo.ejercicio3.Conductor;
import com.softtek.modelo.ejercicio3.IVehiculo;

public class Ejercicio3 {
    public static void main(String[] args) {
        Coche coche = new Coche(10);
        IVehiculo vehiculo = coche;
        Conductor conductor = new Conductor(vehiculo);
        System.out.println(conductor.toString());
    }
}
