package com.softtek.presentacion;

import com.softtek.modelo.ejercicio6.Cliente;
import com.softtek.persistencia.ejercicio6.AccesoDesarrollo;
import com.softtek.persistencia.ejercicio6.ClienteDao;

public class Ejercicio6 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Pepe", "123456789A");

        AccesoDesarrollo accesoDesarrollo = new AccesoDesarrollo();
        accesoDesarrollo.insertar(cliente);
        ClienteDao clienteDao = new ClienteDao(accesoDesarrollo);
        System.out.println(clienteDao.insertar(cliente));
        System.out.println(clienteDao.toString());
    }
}
