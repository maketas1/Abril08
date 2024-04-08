package com.softtek.modelo.ejercicio5;

public class Secretario implements Empleado{
    private IInforme informe;
    private String empresa;
    private String email;

    public Secretario() {
    }

    public Secretario(IInforme informe, String empresa, String email) {
        this.informe = informe;
        this.empresa = empresa;
        this.email = email;
    }

    @Override
    public String getTarea() {
        return "Tarea: Secretario";
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }

    @Override
    public String toString() {
        return "Secretario{" +
                "informe=" + informe +
                ", empresa='" + empresa + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void setInforme(IInforme informe) {
        this.informe = informe;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
