import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //ejemplo1();
        //ejemplo2();
        //ejemplo3();
        //ejemplo4();
        //ejemplo5();
        //ejemplo6();
        ejemplo7();
    }

    public static void ejemplo1()
    {
        System.out.println("------------------");
        System.out.println("     EJEMPLO 1    ");
        System.out.println("------------------");

        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }
    }

    public static void ejemplo2()
    {
        System.out.println("------------------");
        System.out.println("     EJEMPLO 2    ");
        System.out.println("------------------");

        System.out.println("TABLA DE MULTIPLICAR DEL 12");
        for(int i = 1; i <= 12; i++) {
            System.out.println("12 x  " + i + "  = " + i*12);
        }

        System.out.println("INGRESA LA TABLA QUE DESEAS IMPRIMIR: ");
        Scanner scan = new Scanner(System.in);
        int mulptiplier = scan.nextInt();

        for(int i = 1; i <= 12; i++) {
            System.out.println(mulptiplier + " x  " + i + "  = " + i*mulptiplier);
        }
    }

    public static void ejemplo3()
    {
        System.out.println("------------------");
        System.out.println("     EJEMPLO 3    ");
        System.out.println("------------------");

        for(int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void ejemplo4()
    {
        System.out.println("------------------");
        System.out.println("     EJEMPLO 4    ");
        System.out.println("------------------");

        for (int i = 1; i <= 5; i++)
        {
            if(i == 1)
            {
                for(int t = 1; t <=5; t++)
                    System.out.print("Tabla de " + t + "\t");
                System.out.println("");
            }

            for (int j = 1; j <= 5; j++)
            {
                   System.out.print(i + " x " + j + " = " + (i*j) + "\t");
                //System.out.printf("%02d x %02d = %02d\t", i, j, i * j);
            }
            System.out.println("");
        }
    }

    public static void ejemplo5()
    {
        System.out.println("------------------");
        System.out.println("     EJEMPLO 5    ");
        System.out.println("------------------");

        for (int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                System.out.print("*\t");
            }
            System.out.println("");
        }
    }

    public static void ejemplo6()
    {
        System.out.println("------------------");
        System.out.println("     EJEMPLO 6    ");
        System.out.println("------------------");

        for (int i = 1; i <= 8; i++)
        {
            for(int j = 1; j <= 8 - i; j++)
            {
                System.out.print(" ");
            }

            for(int k = 1; k <= i; k++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }

    public static void ejemplo7()
    {
        System.out.println("\n=== MENU DE PATRONES ===");
        System.out.println("==========================");
        System.out.println("\n=== MENU DE PATRONES ===");
    }
}