package com.softtek.modelo.ejercicio7;

public class Producto {
    private String id;
    private String nombre;
    private int precio;
    private String proveedor;
    private String descripcion;

    public Producto() {
    }

    public Producto(String id, String nombre, int precio, String proveedor, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.proveedor = proveedor;
        this.descripcion = descripcion;
    }

    public Producto(String nombre, int precio, String proveedor, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.proveedor = proveedor;
        this.descripcion = descripcion;
    }

    public void comprobar() throws ExcepcionId {
        if (id == null) {
            throw new ExcepcionId();
        }
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", proveedor='" + proveedor + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
