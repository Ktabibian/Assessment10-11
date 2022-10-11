package midterm;

import java.util.ArrayList;
import java.util.Map;

public class App {

    public static void printAllPrintableObjects(IPrint[] printable){

    }

    public static void consumeConsumables(Consumable[] consumables){
        for (int i = 0; i < consumables.length; i++){
        }
    }

    public static void getTotalPriceOfCustomerProducts(Customer customer){

    }

    public static String getSecondaryAddressOfCustomer(Customer customer){
        return customer.getAddresses().toString();
    }

    public static void reverseSortAndPrintAllProductsByPrice(ArrayList<Product> productList){

    }

    public static ArrayList<Double> getListOfProductPricesGreaterThanThePriceOfProductGiven(ArrayList<Product> productList, Product product){
        return null;
    }

    public static void addASingleProductToDirectoryTiedToCustomerByNameThenPrint(Map<String, Product> directory, Customer customer, Product product){

    }
}
