package midterm;

public class PostalStamp extends Product implements Lickable, IPrint{

    public PostalStamp(String name, double price, Size size) {
        super(name, price, size);
    }

    @Override
    public void print() {

    }

    @Override
    public boolean safeToLick() {
        return true;
    }
}
