package midterm;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        IceCream iceCream = new IceCream("Vanilla ice-cream", 5.0, Size.X);
        Battery battery = new Battery("AABattery", 20.0, Size.M);
        PostalStamp stamp = new PostalStamp("FlagStamps", 11.0, Size.S);
        Product[] products = {iceCream, battery, stamp};
        Consumable[] consumables = {iceCream, battery};

        ArrayList<String> address = new ArrayList<>();
        address.add("12 Real News Lane");
        address.add("Dover");
        address.add("DE 19901");

        Admin admin1 = new Admin("Peter", "secretPass21");
        Customer customer1 = new Customer("c1", "password1", 0, 100.0, address, Size.L, products);
        Customer customer2 = new Customer("c2", "password2", 0, 500.0, address, null, products);
        Customer customer3 = new Customer("c3", "password3", 0, 250.0, address, null, products);

        customer1.setAccountBalance(-150.0);
        System.out.println(customer1.getAccountBalance());
        customer1.setRewardPoints(100);
        System.out.println(customer1.getRewardPoints());
        customer1.useRewardPoints(10);
        System.out.println(App.getSecondaryAddressOfCustomer(customer1));
        customer1.setSize(Size.M);
        customer1.print();

        App.consumeConsumables(consumables);
    }
}
