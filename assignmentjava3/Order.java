package assignmentjava3;

public class Order {
    private int orderId;
    private User user;
    private Product product;
    private String paymentMode;
    private Address address;
    private String deliveryStatus;
    
    // Default constructor
    public Order() {
        this.orderId = 0;
        this.user = new User();
        this.product = new Product();
        this.paymentMode = "";
        this.address = new Address();
        this.deliveryStatus = "Pending";
    }
    
    // Parameterized constructor
    public Order(int orderId, User user, Product product, String paymentMode, Address address) {
        this.orderId = orderId;
        this.user = user;
        this.product = product;
        this.paymentMode = paymentMode;
        this.address = address;
        this.deliveryStatus = "Pending";
    }
    
   
    // Getters and Setters
    public int getOrderId() {
        return orderId;
    }
    
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    
    public User getUser() {
        return user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    
    public Product getProduct() {
        return product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
    
    public String getPaymentMode() {
        return paymentMode;
    }
    
    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }
    
    public Address getAddress() {
        return address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
    
    public String getDeliveryStatus() {
        return deliveryStatus;
    }
    
    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
    
   
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("User: " + user.getUserName());
        System.out.println("Product: " + product.getProductName());
        System.out.println("Payment Mode: " + paymentMode);
        System.out.println("Delivery Address: " + address.getDeliveryAddress());
        System.out.println("Status: " + deliveryStatus);
    }
    
    
    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", user=" + user +
                ", product=" + product +
                ", paymentMode='" + paymentMode + '\'' +
                ", address=" + address +
                ", deliveryStatus='" + deliveryStatus + '\'' +
                '}';
    }
    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Order order = (Order) obj;
        return orderId == order.orderId;
    }
}