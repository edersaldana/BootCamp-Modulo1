/**
 * Programa: Bucles y operaciones basicas con condicionales
 * Autor: Eder Saldaña More
 * Fecha: 12/08/2025
 * Descripción: La tarea demuestras las habilidades adquiridas en el manejo de paquetes,
 *              condicionales, bubles.
 */

import java.util.Scanner;
import feature.Calculator;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean menuMain = true;

        while(menuMain)
        {
            System.out.println("=============================");
            System.out.println("   CONVERSOR Y CALCULADORA   ");
            System.out.println("=============================");

            System.out.println("1. CONVERSOR DE MONEDAS");
            System.out.println("2. CALCULADORA");
            System.out.println("3. SALIR");

            if (scan.hasNextInt()) {
                int opcion = scan.nextInt();

                switch (opcion)
                {
                    case 1:
                        convertCoins(scan);
                        break;
                    case 2:
                        calculator(scan);
                        break;
                    case 3:
                        System.out.println("GRACIAS POR UTILIZAR EL MENU DE OPCIONES");
                        menuMain = false;
                        break;
                    default:
                        System.out.println("NO ES UNA OPCION VALIDA");
                }
            }
        }

        scan.close();
    }

    /**
     * Funcion para el menu de conversion de monedas
     * @param scanConv referencia del scanner
     */
    public static void convertCoins(Scanner scanConv)
    {
        boolean opConv = true;
        while(opConv)
        {
            System.out.println("=============================");
            System.out.println("     CONVERSOR DE SOLES A    ");
            System.out.println("=============================");

            System.out.println("1. DOLARES");
            System.out.println("2. EUROS");
            System.out.println("3. YEN JAPONES");
            System.out.println("4. RUBLO RUSO");
            System.out.println("5. LIBRA ESTERLINA");
            System.out.println("6. VOLVER AL MENU PRINCIPAL");

            if (scanConv.hasNextInt()) {
                int opcion = scanConv.nextInt();

                if(opcion < 0)
                    System.out.println("EL NUMERO DEBE SER MAYOR A CERO");
                else if(opcion == 6){
                    System.out.println("REGRESANDO AL MENU PRINCIPAL");
                    opConv = false;
                }
                else if (opcion >= 1 && opcion <= 5) {
                    System.out.print("INGRESE EL MONTO EN SOLES : S/ ");
                    double amount = scanConv.nextDouble();

                    if(amount >= 0)
                    {
                        double amountConv = convert(amount,opcion - 1);
                        System.out.print("EL VALOR PEN " +  amount + " ");
                        switch (opcion)
                        {
                            case 1:
                                System.out.println("EN DOLARES ES USD " + amountConv);
                                break;
                            case 2:
                                System.out.println("EN EUROS ES EUR " + amountConv);
                                break;
                            case 3:
                                System.out.println("EN YEN JAPONES ES JPY " + amountConv);
                                break;
                            case 4:
                                System.out.println("EN RUBLO RUSO ES RUB " + amountConv);
                                break;
                            case 5:
                                System.out.println("EN LIBRA ESTERLINA ES GBP " + amountConv);
                                break;
                        }
                    } else
                    {
                        System.out.println("EL MONTO NO DEBE SER NEGATIVO");
                    }
                }
            }
        }
    }

    /**
     * Funcion para el manejo de calculadora con operaciones simples
     * @param scanCalc referencia del scanner
     */
    public static void calculator(Scanner scanCalc)
    {
        Calculator cal = new Calculator();
        boolean opCalc = true;

        while(opCalc)
        {
            System.out.println("=============================");
            System.out.println("         CALCULADORA         ");
            System.out.println("=============================");

            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. VOLVER AL MENU PRINCIPAL");

            if (scanCalc.hasNextInt()) {
                int opcion = scanCalc.nextInt();

                if(opcion < 0)
                    System.out.println("EL NUMERO DEBE SER MAYOR A CERO");
                else if(opcion == 5){
                    System.out.println("REGRESANDO AL MENU PRINCIPAL");
                    opCalc = false;
                } else if (opcion >= 1 && opcion <= 4) {
                    System.out.println("INGRESE EL PRIMER NUMERO: ");
                    double valor1 = scanCalc.nextDouble();

                    System.out.println("INGRESE EL SEGUNDO NUMERO: ");
                    double valor2 = scanCalc.nextDouble();

                    String result = "";
                    switch (opcion)
                    {
                        case 1:
                            result = "LA SUMA ES " + cal.sumar(valor1, valor2);
                            break;
                        case 2:
                            result = "LA RESTA ES " + cal.restar(valor1, valor2);
                            break;
                        case 3:
                            result = "LA MULTIPLICACION ES " + cal.multiplicar(valor1, valor2);
                            break;
                        case 4:
                            result = (valor2 > 0) ?
                                        "LA MULTIPLICACION ES " + cal.dividir(valor1, valor2) :
                                        "NO SE PUEDE DIVIDIR ENTRE CERO";
                            break;
                    }
                    System.out.println(result);
                }
            }
        }
    }

    /**
     * Realiza la conversion del monto ingresado
     * @param amount monto ingresado por el usuario
     * @param id opcion de conversion
     * @return el monto obtenido durante la conversion.
     */
    public static double convert(double amount, int id)
    {
        double [] convertMonedas = {3.525, 4.10, 0.0238, 0.0444, 4.7592};
        return amount * convertMonedas[id];
    }
}