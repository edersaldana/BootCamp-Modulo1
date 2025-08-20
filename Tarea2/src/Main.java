/**
 * Autor: Eder Saldaña More
 * Fecha: 19/08/25
 * Resumen: Tarea2: Proyecto de Clases, Interfaces, Bucles Arreglos
 *
 * EL proyecto es un sistema basico de BIblioteca, el cual podra registrar libros,
 * revistas o tesis, ademas se puede registar a los diferentes usuarios para el
 * prestamo de libros.
 * Cada vez que se empresta un libro, este dejara de estar disponible en el sistema.
 */

import Packages.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Object[][] books = {
                {"Cien años de soledad", "Gabriel García Márquez"},
                {"Don Quijote de la Mancha", "Miguel de Cervantes Saavedra"},
                {"Orgullo y prejuicio", "Jane Austen"},
                {"Crimen y castigo", "Fiódor Dostoyevski"},
                {"Hamlet", "William Shakespeare"},
                {"La Odisea", "Homero"},
                {"La Divina Comedia", "Dante Alighieri"},
                {"Fausto", "Johann Wolfgang von Goethe"},
                {"La Metamorfosis", "Franz Kafka"}
        };

        Object[][] magazines = {
                {"National Geographic", "Gardiner Greene Hubbard"},
                {"TIME", "Henry Luce y Briton Hadden"},
                {"Scientific American", "Rufus Porter"},
                {"Nature", "Norman Lockyer"},
                {"Forbes", "B.C. Forbes"}
        };

        Object[][] thesis = {
                {"Desarrollo de un sistema de gestión de inventario con Java y MySQL", "Juan Pérez Rodríguez"},
                {"Implementación de una aplicación móvil para el monitoreo de la salud usando Android", "María Fernanda López"},
                {"Algoritmo de optimización para rutas de transporte público usando Python", "Carlos Sánchez Gómez"},
                {"Plataforma web para educación virtual basada en Node.js y React", "Luis Alberto Ramírez"},
                {"Sistema de reconocimiento de voz para asistencia en el hogar con inteligencia artificial", "Daniela Torres Cruz"}
        };


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
            System.out.println("0. Cargar DATA de la Biblioteca");
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
                    case 0:
                        // Agregar el repositorio de libros
                        for (Object[] book : books) {
                            String title = (String) book[0];
                            String autor = (String) book[1];
                            library.addMaterial(new Book("Book", title, autor));
                        }

                        // Agregar el repositorio de revistas
                        for (Object[] magazine : magazines) {
                            String title = (String) magazine[0];
                            String autor = (String) magazine[1];
                            library.addMaterial(new Book("Magazine", title, autor));
                        }

                        // Agregar el repositorio de tesis
                        for (Object[] thesi : thesis) {
                            String title = (String) thesi[0];
                            String autor = (String) thesi[1];
                            library.addMaterial(new Book("Thesis", title, autor));
                        }
                        break;
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
                        scan.nextLine();
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