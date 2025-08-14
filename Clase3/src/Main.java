import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        fnCondicional();

        Scanner scan = new Scanner(System.in);
        System.out.println("===============");
        System.out.println("   EDAD   ");
        System.out.println("===============");

        int edad = scan.nextInt();

        String sEdad = edad >= 18 ? "ES MAYOR DE EDAD" : "ES MENOR DE EDAD";
        System.out.println(sEdad);


        System.out.println("===============");
        System.out.println("     SWTICH    ");
        System.out.println("===============");

        System.out.println("Ingresa el dia de la Semana");

        int day = scan.nextInt();
        switch (day) {
            case 1:
                System.out.println("LUNES");
                break;
            case 2:
                System.out.println("MARTES");
                break;
            case 3:
                System.out.println("MIERCOLES");
                break;
            case 4:
                System.out.println("JUEVES");
                break;
            case 5:
                System.out.println("VIERNES");
                break;
            case 6:
                System.out.println("SABADO");
                break;
            case 7:
                System.out.println("DOMINGO");
                break;
            default:
                System.out.println("NO SE PUEDE COMPROBAR EL DIA DE LA SEMANA");
        }

        System.out.println("FIN DEL PROGRAMA");




        System.out.println("===============");
        System.out.println("   EJERCICIO   ");
        System.out.println("===============");

        System.out.println("PRECIO INICIAL: ");
        int precio = scan.nextInt();
        int precioFinal;

        System.out.println("¿QUE TIPO DE USUARIO ES (VIP = 1 o NORMAL = 2)?");
        int svip = scan.nextInt();

        precioFinal = (svip == 1) ? precio - (precio * 20/100) : precio - (precio * 5/100);
        System.out.println("El precio final es: " + precioFinal);

        // Cerrar el scanner
        scan.close();
    }

    public static void fnCondicional()
    {
        System.out.println("===============");
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa la nota: ");
        int nota = scan.nextInt();

        if(nota >= 16)
            System.out.println("ESTAS APROBADO CON AD");
        else if (nota >= 13)
            System.out.println("ESTAS APROBADO CON A");
        else if (nota >= 11)
            System.out.println("ESTAS APROBADO CON B");
        else
            System.out.println("DESAPROBADO");

        scan.close();
    }
}