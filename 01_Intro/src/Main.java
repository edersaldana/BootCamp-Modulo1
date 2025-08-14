import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crear el Scanner

        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();  // Lee una línea completa

        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();        // Lee un entero

        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");

        sc.close(); // Cerrar el Scanner
    }
}
