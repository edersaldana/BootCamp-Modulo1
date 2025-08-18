import Packages.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Library library = new Library();

        int option;
        boolean isCompleted = false;

        while(!isCompleted)
        {
            System.out.println("*****************************************");
            System.out.println("**  Sistema de Préstamo de Materiales  **");
            System.out.println("*****************************************");
            System.out.println(" ");
            System.out.println("1. Registrar libro");
            System.out.println("2. Registrar revista");
            System.out.println("3. Registrar tesis");
            System.out.println("4. Registrar usuario");
            System.out.println("5. Mostrar materiales disponibles");
            System.out.println("6. Prestar material");
            System.out.println("7. Devolver material");
            System.out.println("8. Salir");
            System.out.print("Elige una opción: ");

            if (scan.hasNextInt()) {
                option = scan.nextInt();
                scan.nextLine();
                switch (option) {
                    case 1:
                        System.out.print("Título: ");
                        String tLibro = scan.nextLine();
                        System.out.print("Autor: ");
                        String aLibro = scan.nextLine();
                        library.addMaterial(new Book("Book", tLibro, aLibro));
                        break;
                    case 2:
                        System.out.print("Título: ");
                        String tRevista = scan.nextLine();
                        System.out.print("Autor: ");
                        String aRevist = scan.nextLine();
                        library.addMaterial(new Magazine("Magazine", tRevista, aRevist));
                        break;
                    case 3:
                        System.out.print("Título: ");
                        String tTesis = scan.nextLine();
                        System.out.print("Autor: ");
                        String aTesis = scan.nextLine();
                        library.addMaterial(new Thesis("Thesis", tTesis, aTesis));
                        break;
                    case 4:
                        System.out.print("Nombre nombre: ");
                        String name = scan.nextLine();
                        System.out.print("Nombre edad: ");
                        int age = scan.nextInt();
                        System.out.print("Nombre ciudad: ");
                        String city = scan.nextLine();
                        library.addUser(new User(name, age, city));
                        break;
                    case 5:
                        library.showMarerials();
                        break;
                    case 6:
                        System.out.print("Título del material: ");
                        String tPrestamo = scan.nextLine();
                        System.out.print("Usuario: ");
                        String uPrestamo = scan.nextLine();
                        library.materialToast(tPrestamo, uPrestamo);
                        break;
                    case 7:
                        System.out.print("Título del material: ");
                        String tDevolver = scan.nextLine();
                        System.out.print("Usuario: ");
                        String uDevolver = scan.nextLine();
                        library.materialReturn(tDevolver, uDevolver);
                        break;
                    case 8:
                        isCompleted = true;
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } else {
                System.out.println("Debes ingresar un número válido.");
                scan.next(); // descarta la entrada inválida
                option = -1;
            }
        }

        scan.close();
    }
}