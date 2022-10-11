package midterm;

public class IceCream extends Product implements Consumable, Lickable{

    public IceCream(String name, double price, Size size) {
        super(name, price, size);
    }

    @Override
    public void consume() {
        System.out.println("Now consuming " + getName());
    }

    @Override
    public boolean safeToLick() {
        return true;
    }
}
