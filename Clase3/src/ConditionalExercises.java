import java.util.Scanner;

public class ConditionalExercises {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su primer numero: ");
        int pNumero = scan.nextInt();
        System.out.println("Ingrese su segundo numero: ");
        int sNumero = scan.nextInt();
        System.out.println("Ingrese su opcion:");
        System.out.println("1. SUMAR:");
        System.out.println("2. RESTAR:");
        System.out.println("3. MULTIPLICAR:");
        System.out.println("4. DIVIDIR:");
        int operacion = scan.nextInt();
        double resultado = 0.0;

        switch (operacion)
        {
            case 1:
                resultado = pNumero + sNumero;
                break;
            case 2:
                resultado = pNumero - sNumero;
                break;
            case 3:
                resultado = pNumero * sNumero;
                break;
            case 4:
                if(sNumero > 0)
                    resultado = pNumero / sNumero;
                else
                    System.out.println("El dividendo es igual a cero, no se puede ejecutar la division");
                break;
            default:
                System.out.println("Ingreso una opcion incorrecta");

        }

        String posNega = (resultado > 0) ? "RESULTADO POSITIVO" : "RESULTADO NEGATIVO";

        System.out.println("El Resultado es: " + posNega);
        System.out.println("El Valor es: " + resultado);

    }
}
