import java.awt.event.PaintEvent;
import java.util.*;

public class CollectionsGuide {

    public static void main(String[] args) {

        //ejemplo1_Arrays();
        //ejemplo2_Colleciones();
        //ejemplo3_Set();
        ejemplo4_Map();

    }

    public static void ejemplo1_Arrays()
    {
        List<String> lenguajes = new ArrayList<>();

        lenguajes.add("kotlin");
        lenguajes.add("Java");
        lenguajes.add("C#");
        lenguajes.add("Python");
        lenguajes.add("TypeScript");
        lenguajes.add("C++");
        lenguajes.add("C");

        for(String lenguaje : lenguajes)
        {
            System.out.println(lenguaje);
        }

        System.out.println("El elemento Java existe? "+ lenguajes.contains("Java"));
        System.out.println("El elemento del indice 1 " + lenguajes.get(1));

        lenguajes.set(3, "Golang");

        System.out.println("Remover el ultimo lenguaje");
        lenguajes.remove(5);

        for(String lenguaje : lenguajes)
        {
            System.out.println(lenguaje);
        }
    }

    public static void ejemplo2_Colleciones()
    {
        List<Double> calificaciones = new ArrayList<>();

        calificaciones.add(11.4);
        calificaciones.add(18.0);
        calificaciones.add(13.4);
        calificaciones.add(14.5);
        calificaciones.add(16.5);

        double suma = 0;
        for (Double calificacion : calificaciones)
            suma += calificacion;

        double promedio = suma / calificaciones.size();
        System.out.println("Su promedio es: " + promedio);

        // Encontrar el minimo y maximo
        double min = Collections.min(calificaciones);
        double max = Collections.max(calificaciones);
        System.out.println("La nota mas alta y minima es: " + max + " " + min);

        // Buscar un elemento
        System.out.println("la nota 18.0 existe en mi lista? " + calificaciones.contains(18.0));
    }

    public static void ejemplo3_Set()
    {
        List<String> paises = new ArrayList<>();

        paises.add("Peru");
        paises.add("Colombia");
        paises.add("Panama");
        paises.add("Peru");

        for (String pais : paises)
            System.out.println(pais);
    }

    public static void ejemplo4_Map()
    {
        Map<String, Integer> edades = new HashMap<>();

        edades.put("Pepito", 28);
        edades.put("Angel", 26);
        edades.put("Paula", 25);

        System.out.println("La edad de Paula es: " + edades.get("Paula"));
        System.out.println("La persona Uriel existe en mi lista? " + edades.containsKey("Manuel"));

        for(var e: edades.entrySet())
        {
            String nombre = e.getKey();
            Integer edad = e.getValue();
            System.out.println(nombre + "->" + edad);
        }

        // Streams, forma de iterar
        //edades.forEach(clave, valor) -> System.out.println(clave + "tiene" + valor);

    }
}
