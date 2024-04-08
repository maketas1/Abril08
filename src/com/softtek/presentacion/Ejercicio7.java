package com.softtek.presentacion;

import com.softtek.modelo.ejercicio7.ExcepcionId;
import com.softtek.modelo.ejercicio7.Producto;

public class Ejercicio7 {
    public static void main(String[] args) {
        Producto producto1 = new Producto();
        try {
            producto1.comprobar();
        } catch (ExcepcionId e) {
            e.printStackTrace();
        }

        Producto producto2 = new Producto("10a", "leche", 10, "puleva", "leche de vaca");
        try {
            producto2.comprobar();
        } catch (ExcepcionId e) {
            e.printStackTrace();
        }
    }
}
