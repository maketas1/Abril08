package com.softtek.presentacion;

import com.softtek.modelo.ejercicio7.ExcepcionId;
import com.softtek.modelo.ejercicio7.Producto;

public class Ejercicio7 {
    public static void main(String[] args) {
        Producto producto = new Producto();
        try {
            producto.comprobar();
        } catch (ExcepcionId e) {
            e.printStackTrace();
        }
    }
}
