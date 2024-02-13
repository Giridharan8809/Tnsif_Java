package Ass2;
import java.util.ArrayList;

class Product {
    private int productId;
    private String productName;
    int quantityInStock;
    private double pricePerUnit;

    public Product(int productId, String productName, int quantityInStock, double pricePerUnit) {
        this.productId = productId;
        this.productName = productName;
        this.quantityInStock = quantityInStock;
        this.pricePerUnit = pricePerUnit;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    @Override
    public String toString() {
        return "Product ID: " + productId +
               "\nProduct Name: " + productName +
               "\nQuantity in Stock: " + quantityInStock +
               "\nPrice per Unit: $" + pricePerUnit + "\n";
    }
}

class Inventory {
    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(int productId) {
        products.removeIf(product -> product.getProductId() == productId);
    }

    public void updateQuantity(int productId, int newQuantity) {
        for (Product product : products) {
            if (product.getProductId() == productId) {
                product.quantityInStock = newQuantity;
                break;
            }
        }
    }

    public void displayInventory() {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

     
        inventory.addProduct(new Product(1, "Laptop", 10, 899.99));
        inventory.addProduct(new Product(2, "Printer", 5, 149.99));
        inventory.addProduct(new Product(3, "Mouse", 20, 19.99));
   
        System.out.println("Initial Inventory:");
        inventory.displayInventory();

        inventory.updateQuantity(1, 8);
        inventory.updateQuantity(3, 15);

        System.out.println("\nUpdated Inventory:");
        inventory.displayInventory();

        inventory.removeProduct(2);

        System.out.println("\nFinal Inventory:");
        inventory.displayInventory();
    }
}