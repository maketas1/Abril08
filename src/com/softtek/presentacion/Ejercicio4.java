package com.softtek.presentacion;

import com.softtek.modelo.ejercicio4.Coche;
import com.softtek.modelo.ejercicio4.Italler;
import com.softtek.modelo.ejercicio4.SeguroCoche;

public class Ejercicio4 {
    public static void main(String[] args) {
        Coche coche = new Coche("1234ABC", "Ford gt40");
        Italler taller = new Italler();
        SeguroCoche seguroCoche = new SeguroCoche(taller, "Mutua");

        System.out.println(seguroCoche.reparar(coche));
    }
}
