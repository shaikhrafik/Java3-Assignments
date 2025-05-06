package assignmentjava3;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private int numberOfProducts;
    private double totalCartPrice;
    private List<Product> products;
    
    // Default constructor
    public Cart() {
        this.numberOfProducts = 0;
        this.totalCartPrice = 0.0;
        this.products = new ArrayList<>();
    }
    
    // Parameterized constructor
    public Cart(List<Product> products) {
        this.products = new ArrayList<>(products);
        this.numberOfProducts = products.size();
        calculateTotalPrice();
    }
    
    // Getters and Setters
    public int getNumberOfProducts() {
        return numberOfProducts;
    }
    
    public double getTotalCartPrice() {
        return totalCartPrice;
    }
    
    public List<Product> getProducts() {
        return products;
    }
    
   
    public void addProduct(Product product) {
        products.add(product);
        numberOfProducts++;
        totalCartPrice += product.getCost();
    }
    
    
    public boolean removeProduct(int productId) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductId() == productId) {
                totalCartPrice -= products.get(i).getCost();
                products.remove(i);
                numberOfProducts--;
                return true;
            }
        }
        return false;
    }
    
    
    public double calculateTotalPrice() {
        totalCartPrice = 0;
        for (Product product : products) {
            totalCartPrice += product.getCost();
        }
        return totalCartPrice;
    }
    
   
    public double calculateTotalPrice(double discountPercentage) {
        double originalPrice = calculateTotalPrice();
        return originalPrice - (originalPrice * discountPercentage / 100);
    }
    
   
    @Override
    public String toString() {
        return "Cart{" +
                "numberOfProducts=" + numberOfProducts +
                ", totalCartPrice=" + totalCartPrice +
                ", products=" + products +
                '}';
    }
}

