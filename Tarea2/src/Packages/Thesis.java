package Packages;

public class Thesis extends  Material implements  Option {

    public Thesis(String category, String title, String author) {
        super(category, title, author);
    }

    @Override
    public void fcToast() {
        if(isAvailable == true)
        {
            isAvailable = false;
        }
    }

    @Override
    public void fcReturn() {
        isAvailable = true;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

}
