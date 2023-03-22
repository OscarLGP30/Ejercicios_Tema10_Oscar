package org.example;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                // Pedir al usuario la operación a realizar
                System.out.println("Operaciones disponibles:");
                System.out.println("+ para sumar");
                System.out.println("- para restar");
                System.out.println("* para multiplicar");
                System.out.println("/ para dividir");
                System.out.println("% para obtener el resto de la división");
                System.out.print("Elija una operación: ");
                String operacion = scanner.nextLine();

                // Verificar que la operación sea válida
                if (!operacion.equals("+") && !operacion.equals("-") && !operacion.equals("*") && !operacion.equals("/") && !operacion.equals("%")) {
                    throw new IllegalArgumentException("Operación inválida");
                }

                // Pedir al usuario los operandos
                System.out.print("Introduzca el primer número: ");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.print("Introduzca el segundo número: ");
                int b = Integer.parseInt(scanner.nextLine());

                // Realizar la operación correspondiente
                int resultado = 0;
                switch (operacion) {
                    case "+":
                        resultado = Operacion.suma(a, b);
                        break;
                    case "-":
                        resultado = Operacion.resta(a, b);
                        break;
                    case "*":
                        resultado = Operacion.multiplicacion(a, b);
                        break;
                    case "/":
                        if (b == 0) {
                            throw new ArithmeticException("División por cero");
                        }
                        resultado = a / b;
                        break;
                    case "%":
                        if (b == 0) {
                            throw new ArithmeticException("División por cero");
                        }
                        resultado = a % b;
                        break;
                }

                // Mostrar el resultado
                System.out.printf("%d %s %d = %d%n", a, operacion, b, resultado);
            } catch (NumberFormatException e) {
                System.out.println("Los operandos deben ser números enteros.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (DesbordaCapacidadExcepcion e) {
                System.out.println(e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }

        }

    }
    
}