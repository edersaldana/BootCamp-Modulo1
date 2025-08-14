import feature.Calculator;
import feature.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Calculator casio = new Calculator();

        System.out.println("ingrese su primer numero: ");
        int numeroA = scan.nextInt();

        System.out.println("ingrese su segundo numero: ");
        int numeroB = scan.nextInt();

        System.out.println("Resultado de la suma: " + casio.sumar(numeroA, numeroB));
        System.out.println("Resultado de la resta: " + casio.restar(numeroA, numeroB));
        System.out.println("Resultado de la multiplicacion: " + casio.multiplicar(numeroA, numeroB));
        System.out.println("Resultado de la division: " + casio.dividir(numeroA, numeroB));

        scan.close();
    }
}