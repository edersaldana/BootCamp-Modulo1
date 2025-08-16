package paquete;
import java.util.LinkedList;

public class collections {
    public static void main(String[] args) {

        LinkedList<String> tareas = new LinkedList<>();
        tareas.addFirst("Tarea1"); // Agrega al inicio
        tareas.addLast("Tarea2"); // Agrega al final
        tareas.removeFirst(); // Elimina Tarea1
    }
}
