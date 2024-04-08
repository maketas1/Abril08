package com.softtek.modelo.ejercicio5;

public class Director implements Empleado{
    private IInforme informe;

    public Director() {
    }

    public Director(IInforme informe) {
        this.informe = informe;
    }

    @Override
    public String getTarea() {
        return "Tarea: Director";
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }

    @Override
    public String toString() {
        return "Director{" +
                "informe=" + informe +
                '}';
    }

    public void setInforme(IInforme informe) {
        this.informe = informe;
    }
}
