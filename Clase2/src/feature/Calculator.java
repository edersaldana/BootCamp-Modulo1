package feature;

public class Calculator {

    int datoA = 6;
    int datoB = 4;

    public Calculator() {
    }

    public Calculator(int datoA, int datoB) {
        this.datoA = datoA;
        this.datoB = datoB;
    }

    public int sumar() {
        return datoA + datoB;
    }

    public int sumar(int valor1, int valor2) {
        return valor1 + valor2;
    }

    public int restar() {
        return datoA - datoB;
    }

    public int restar(int valor1, int valor2) {
        return valor1 - valor2;
    }

    public int multiplicar(int valor1, int valor2) {
        return valor1 * valor2;
    }

    public double dividir(int valor1, int valor2) {
        return (double) valor1 / valor2;
    }
}
