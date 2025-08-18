package Packages;

public abstract class Material {

    protected boolean isAvailable;
    protected String category;
    protected String title;
    protected String author;

    public Material( String category, String title, String author) {
        this.category = category;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String category()
    {
        return category;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public boolean available()
    {
        return isAvailable;
    }

    public String infoMaterial()
    {
        return "Su categoria es: " + category + "  ,su titulo es: " + title + "  y el autor es: " + author ;
    }

    public String toString() {
        return "Categoria: " + category +
               ", Material: " + title +
               ", Autor: " + author +
               " (" + (isAvailable ? "DISPONIBLE" : "NO DISPONIBLE") + ")";
    }
}
