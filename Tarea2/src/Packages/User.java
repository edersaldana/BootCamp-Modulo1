package Packages;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class User {

    private String name;
    private String city;
    private int age;

    private ArrayList<Material> resources;

    public User(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;

        resources = new ArrayList<>();
    }

    public void addResources(Material material)
    {
        resources.add(material);
    }

    public void removeResource(Material material)
    {
        resources.remove(material);
    }

    public void showMaterial()
    {
        if(resources.isEmpty())
        {
            System.out.println(name + " no tiene materiales de informacion a su dispocicion prestados.");
        }
        else
        {
            System.out.println("Los materiales que tiene " + name + " son:");
            for (Material r : resources) {
                System.out.println(" -> " + r);
            }
        }
    }

    public String getUser()
    {
        return name;
    }

    public String getInfoUser()
    {
        return "Nombre: " + name + "  Edad: " + age + "  Ciudad: " + city;
    }

}
