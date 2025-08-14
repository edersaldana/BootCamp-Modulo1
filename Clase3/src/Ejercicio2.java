import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese su monto en dolares: ");
        double sNumero = scan.nextDouble();

        System.out.println("Ingrese su opcion de conversion:");
        System.out.println("1. EUROS:");
        System.out.println("2. PESOS MEXICANOS:");
        System.out.println("3. YENES JAPONESES:");

        int convert = scan.nextInt();
        double precioConvert = 0.0;

        double eur = 0.86;
        double mex = 15.58;
        double jap = 147.82;

        switch (convert){
            case 1:
                precioConvert = sNumero * eur;
                break;
            case 2:
                precioConvert = sNumero * mex;
                break;
            case 3:
                precioConvert = sNumero * jap;
                break;
            default:
                System.out.println("NO HAY CONVERSION DEFINIDA");
        }

        if(sNumero > 0.0)
            System.out.println("EL MONTO INGRESADO ES POSITIVO");
        else
            System.out.println("EL MONTO INGRESADO ES NEGATIVO");

        String mConvert = (precioConvert >= 1000) ? "ALTO" : "BAJO";
        System.out.println("EL MONTO CONVERTIDO ES " + mConvert);
        System.out.println("EL VALOR DEL MONTO ES: " + precioConvert);

    }
}
