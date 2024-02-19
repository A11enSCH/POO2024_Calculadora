package Operaciones;

public class Division implements Operacion {
    public double calcular(double x, double y) {
        if (y != 0) {
            return x / y;
        } else {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
    }
}