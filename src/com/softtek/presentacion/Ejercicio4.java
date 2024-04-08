package com.softtek.presentacion;

import com.softtek.modelo.ejercicio4.Coche;
import com.softtek.modelo.ejercicio4.Italler;
import com.softtek.modelo.ejercicio4.SeguroCoche;
import com.softtek.modelo.ejercicio4.TallerPintura;

public class Ejercicio4 {
    public static void main(String[] args) {
        Coche coche = new Coche("1234ABC", "Ford gt40");
        SeguroCoche seguroCoche = new SeguroCoche();
        TallerPintura tallerPintura = new TallerPintura();
        seguroCoche.setTaller(tallerPintura);
        seguroCoche.setAseguradora("Mutua");

        System.out.println(seguroCoche.reparar(coche));
    }
}
