package com.softtek.persistencia.ejercicio6;

import com.softtek.modelo.ejercicio6.Cliente;

public class AccesoDesarrollo implements IDAO{
    @Override
    public String insertar(Cliente cliente) {
        return "Desarrollo" + cliente.toString();
    }


}
