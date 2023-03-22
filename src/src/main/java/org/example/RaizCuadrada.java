package org.example;


import java.util.Scanner;

public class RaizCuadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca un valor numérico
        System.out.print("Introducir un valor: ");
        double valor = scanner.nextDouble();

        // Calcular la raíz cuadrada y mostrar el resultado o un mensaje de error
        try {
            double resultado = raizCuadrada(valor);
            System.out.printf("√%.2f = %.2f", valor, resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("La raíz cuadrada no está definida para un número negativo.");
        }
    }

    public static double raizCuadrada(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("El argumento debe ser no negativo");
        }
        return Math.sqrt(x);
    }
}

