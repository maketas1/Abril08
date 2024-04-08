package com.softtek.persistencia.ejercicio6;

import com.softtek.modelo.ejercicio6.Cliente;

public class AccesoProduccion extends IDAO{
    @Override
    public String insertar(Cliente cliente) {
        return cliente.toString();
    }
}
