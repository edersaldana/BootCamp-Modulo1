package Packages;

import java.util.ArrayList;

public class Library {

    private ArrayList<Material> materials;
    private ArrayList<User> users;

    public Library() {
        materials = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addMaterial(Material material)
    {
        materials.add(material);
    }

    public void addUser(User user)
    {
        users.add(user);
    }

    public void showMarerials()
    {
        for(Material m : materials)
        {
            System.out.println(" -> " + m);
        }
    }

    public Material searchMaterial(String title)
    {
        for (Material m : materials)
        {
            if(m.getTitle().equalsIgnoreCase(title))
                return m;
        }
        return null;
    }

    public User searchUser(String name)
    {
        for(User u : users)
        {
            if(u.getUser().equalsIgnoreCase(name))
                return u;
        }
        return null;
    }

    public void materialToast(String title, String name)
    {
        Material resource = searchMaterial(title);
        User user = searchUser(name);

        if(resource != null && user != null)
        {
            Option op = (Option) resource;
            if(op.isAvailable())
            {
                op.fcToast();
                user.addResources(resource);
                System.out.println("Se realiza el prestamo del material " + title);
            }
            else
            {
                System.out.println("No se encontro informacion del material " + title);
            }
        }
    }

    public void materialReturn(String title, String name)
    {
        Material resource = searchMaterial(title);
        User user = searchUser(name);

        if(resource != null && user != null)
        {
            Option op = (Option) resource;
            op.fcReturn();
            user.removeResource(resource);
            System.out.println("Se realiza la devolucion del material " + title);
        }
        else if (resource == null)
        {
            System.out.println("No se encontro informacion del material " + title);
        }
        else if(user == null)
        {
            System.out.println("EL usuario " + name + " no existe");
        }
        else
        {
            System.out.println("No hay informacion registrada del material y usuario");
        }
    }

}
