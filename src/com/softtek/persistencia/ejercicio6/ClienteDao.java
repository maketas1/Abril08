package com.softtek.persistencia.ejercicio6;

import com.softtek.modelo.ejercicio6.Cliente;

public class ClienteDao {
    private IDAO conexion;

    public ClienteDao() {
    }

    public ClienteDao(IDAO conexion) {
        this.conexion = conexion;
    }

    public void insertar(Cliente cliente) {
        conexion.insertar(cliente);
    }

    @Override
    public String toString() {
        return "ClienteDao{" +
                "conexion=" + conexion +
                '}';
    }

    public IDAO getConexion() {
        return conexion;
    }

    public void setConexion(IDAO conexion) {
        this.conexion = conexion;
    }
}
