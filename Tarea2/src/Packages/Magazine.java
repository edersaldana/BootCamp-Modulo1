package Packages;

public class Magazine extends  Material implements  Option {

    public Magazine(String category, String title, String author) {
        super(category, title, author);
    }

    @Override
    public void fcToast() {

    }

    @Override
    public void fcReturn() {

    }

    @Override
    public boolean isAvailable() {
        return false;
    }
}
