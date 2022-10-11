package midterm;

import java.util.ArrayList;
import java.util.Arrays;

public class Customer extends User{
    private int rewardPoints;
    private double accountBalance;
    private ArrayList<String> addresses;
    private Size size;
    private Product[] products;

    public Customer(String username, String password, int rewardPoints, double accountBalance, ArrayList<String> addresses, Size size, Product[] products) {
        super(username, password);
        this.rewardPoints = rewardPoints;
        this.accountBalance = accountBalance;
        this.addresses = addresses;
        this.size = size;
        this.products = products;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        if(accountBalance >= 0){
            this.accountBalance = accountBalance;
        }
    }

    public ArrayList<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<String> addresses) {
        this.addresses = addresses;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "rewardPoints=" + rewardPoints +
                ", accountBalance=" + accountBalance +
                ", addresses=" + addresses +
                ", size=" + size +
                ", products=" + Arrays.toString(products) +
                '}';
    }

    public void useRewardPoints(int spentPoints){
        this.rewardPoints = this.rewardPoints - spentPoints;
        System.out.println("You just used " + spentPoints + " points and now you have " + this.rewardPoints + " points left");
    }

    @Override
    public void print() {
        System.out.println("username: " + getUsername() + "\n" + "reward points: " + getRewardPoints() + "\n" + "accountBalance: " + getAccountBalance() + "\n" + "Size: " + getSize());
    }
}
