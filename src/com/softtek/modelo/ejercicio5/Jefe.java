package com.softtek.modelo.ejercicio5;

public class Jefe implements Empleado{
    private IInforme informe;

    public Jefe() {
    }

    public Jefe(IInforme informe) {
        this.informe = informe;
    }

    @Override
    public String getTarea() {
        return "Tarea: Jefe";
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }

    @Override
    public String toString() {
        return "Jefe{" +
                "informe=" + informe +
                '}';
    }

    public void setInforme(IInforme informe) {
        this.informe = informe;
    }
}
