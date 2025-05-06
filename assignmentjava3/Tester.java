package assignmentjava3;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Tester {
    public static void main(String[] args) {
        // Create Address
        Address address = new Address("123Swargate,Pune", "Swargate,Pune");
        
        // Create User
        User user = new User(1, "Rafik", address, "password123", 
                            "Rafik", LocalDateTime.now(), "1234567890", 
                            LocalDate.of(1999, 1, 1));
        
        // Create Products
        Product product1 = new Product(101, "Laptop", 100, 4.5, "High-performance laptop");
        Product product2 = new Product(102, "Smartphone", 60, 4.2, "Latest smartphone model");
        
        // Create Cart and add products
        Cart cart = new Cart();
        cart.addProduct(product1);
        cart.addProduct(product2);
        
        // Display product details
        System.out.println("Product Details:");
        product1.displayProductDetails();
        System.out.println();
        product1.displayProductDetails(false);
        System.out.println();
        
        // Display user details
        System.out.println("User Details:");
        user.displayUserDetails();
        System.out.println();
        user.displayUserDetails(false);
        System.out.println();
        
        // Calculate and display cart total
        System.out.println("Cart Total: $" + cart.calculateTotalPrice());
        System.out.println("Cart Total with 10% discount: $" + cart.calculateTotalPrice(10));
        System.out.println();
        
        // Create Order
        Order order = new Order(1001, user, product1, "Credit Card", address);
        order.setDeliveryStatus("Shipped");
        
        // Display order details
        System.out.println("Order Details:");
        order.displayOrderDetails();
    }
}
