package com.softtek.modelo.ejercicio8;

import com.softtek.modelo.ejercicio7.ExcepcionId;

public class Calculadora {
    private double dato1;
    private double dato2;
    private double resultado;

    public Calculadora() {
    }

    public Calculadora(double dato1, double dato2) {
        this.dato1 = dato1;
        this.dato2 = dato2;
    }

    public double calcular(int operacion) {
        switch (operacion) {
            case 1:
                resultado = sumar();
                break;
            case 2:
                resultado = restar();
                break;
            case 3:
                resultado = multiplicar();
                break;
            case 4:
                dividir();
                break;
        }
        return resultado;
    }

    public double sumar() {
        return dato1 + dato2;
    }

    public double restar() {
        return dato1 - dato2;
    }

    public double multiplicar() {
        return dato1 * dato2;
    }

    public void dividir() {
        if (dato1 == 0 || dato2 == 0) {
            try {
                throw new ExcepcionId();
            } catch (ExcepcionId e) {
                e.printStackTrace();
                resultado = 0;
            }
        } else {
            resultado = dato1 / dato2;
        }
    }

    @Override
    public String toString() {
        return "Calculadora{" +
                "numero 1 =" + dato1 +
                ", numero 2 =" + dato2 +
                ", resultado=" + resultado +
                '}';
    }

    public double getDato1() {
        return dato1;
    }

    public void setDato1(double dato1) {
        this.dato1 = dato1;
    }

    public double getDato2() {
        return dato2;
    }

    public void setDato2(double dato2) {
        this.dato2 = dato2;
    }
}
