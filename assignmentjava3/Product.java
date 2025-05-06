package assignmentjava3;

public class Product {
    private int productId;
    private String productName;
    private double cost;
    private double rating;
    private String productDescription;
    
    public Product() {
        this.productId = 0;
        this.productName = "";
        this.cost = 0.0;
        this.rating = 0.0;
        this.productDescription = "";
    }
    
    // Parameterized constructor
    public Product(int productId, String productName, double cost, double rating, String productDescription) {
        this.productId = productId;
        this.productName = productName;
        this.cost = cost;
        this.rating = rating;
        this.productDescription = productDescription;
    }
    
       
    // Getters and Setters
    public int getProductId() {
        return productId;
    }
    
    public void setProductId(int productId) {
        this.productId = productId;
    }
    
    public String getProductName() {
        return productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    public double getCost() {
        return cost;
    }
    
    public void setCost(double cost) {
        this.cost = cost;
    }
    
    public double getRating() {
        return rating;
    }
    
    public void setRating(double rating) {
        this.rating = rating;
    }
    
    public String getProductDescription() {
        return productDescription;
    }
    
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    
    
    public void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Cost: $" + cost);
        System.out.println("Rating: " + rating);
        System.out.println("Description: " + productDescription);
    }
    
    // Overloaded method to display product details with custom format
    public void displayProductDetails(boolean detailed) {
        if (detailed) {
            System.out.println("Detail Product Info");
            displayProductDetails();
        } else {
            System.out.println("Product: " + productName + " - $" + cost);
        }
    }
    
    
    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", cost=" + cost +
                ", rating=" + rating +
                ", productDescription='" + productDescription + '\'' +
                '}';
    }
    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Product product = (Product) obj;
        return productId == product.productId;
    }
}
