package com.softtek.presentacion;

import com.softtek.modelo.ejercicio8.Calculadora;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String seguir;

        terminal();

        System.out.print("Quiere realizar otra operacion s/n");
        seguir = scanner.nextLine();
        while (!seguir.equals("n")){
            terminal();

            System.out.print("Quiere realizar otra operacion s/n");
            seguir = scanner.nextLine();
        }
    }

    public static void terminal() {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        int operacion;

        System.out.println("Que tipo de operacion quieres realizar?");
        System.out.println("1 -> sumar");
        System.out.println("2 -> restar");
        System.out.println("3 -> multiplicar");
        System.out.println("4 -> dividir");
        operacion = scanner.nextInt();

        System.out.println("Ahora dime el primer dato para la operacion: ");
        calculadora.setDato1(scanner.nextDouble());

        System.out.println("Ahora dime el segundo dato para la operacion: ");
        calculadora.setDato2(scanner.nextDouble());

        System.out.println("El resultado de su operacion es: " + calculadora.calcular(operacion));
    }
}
