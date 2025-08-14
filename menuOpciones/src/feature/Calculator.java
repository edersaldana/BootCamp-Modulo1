package feature;

public class Calculator {

    public Calculator() {
    }

    public String sumar(double valor1, double valor2) {
        return String.valueOf(valor1 + valor2);
    }

    public String restar(double valor1, double valor2) {
        return String.valueOf(valor1 - valor2);
    }

    public String multiplicar(double valor1, double valor2) {
        return String.valueOf(valor1 * valor2);
    }

    public String dividir(double valor1, double valor2) {
        return String.valueOf(valor1 / valor2);
    }
}
