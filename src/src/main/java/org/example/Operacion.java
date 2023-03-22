package org.example;

public class Operacion {
    public static int suma(int a, int b) throws DesbordaCapacidadExcepcion {
        long resultado = (long) a + (long) b;
        if (resultado < Integer.MIN_VALUE || resultado > Integer.MAX_VALUE) {
            throw new DesbordaCapacidadExcepcion();
        }
        return (int) resultado;
    }

    public static int resta(int a, int b) throws DesbordaCapacidadExcepcion {
        long resultado = (long) a - (long) b;
        if (resultado < Integer.MIN_VALUE || resultado > Integer.MAX_VALUE) {
            throw new DesbordaCapacidadExcepcion();
        }
        return (int) resultado;
    }

    public static int multiplicacion(int a, int b) throws DesbordaCapacidadExcepcion {
        long resultado = (long) a * (long) b;
        if (resultado < Integer.MIN_VALUE || resultado > Integer.MAX_VALUE) {
            throw new DesbordaCapacidadExcepcion();
        }
        return (int) resultado;
    }
}

