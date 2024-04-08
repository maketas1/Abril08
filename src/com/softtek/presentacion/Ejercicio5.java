package com.softtek.presentacion;

import com.softtek.modelo.ejercicio5.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        InformeTrimestre2 informeTrimestre2 = new InformeTrimestre2();

        InformeTrimestre1 informeTrimestre1 = new InformeTrimestre1();

        Jefe jefe = new Jefe(informeTrimestre1);
        System.out.println(jefe.toString());
        System.out.println(jefe.getTarea());

        Director director = new Director(informeTrimestre2);
        System.out.println(director.toString());
        System.out.println(director.getTarea());

        Secretario secretario = new Secretario(informeTrimestre1, "Softtek", "secretario@gmail.com");
        System.out.println(secretario.toString());
        System.out.println(secretario.getTarea());
    }
}
