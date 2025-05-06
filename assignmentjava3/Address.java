package assignmentjava3;

public class Address {
    private String shippingAddress;
    private String deliveryAddress;
    
    // Default constructor
    public Address() {
        this.shippingAddress = "";
        this.deliveryAddress = "";
    }
    
    // Parameterized constructor
    public Address(String shippingAddress, String deliveryAddress) {
        this.shippingAddress = shippingAddress;
        this.deliveryAddress = deliveryAddress;
    }
    
    // Copy constructor
    public Address(Address address) {
        this.shippingAddress = address.shippingAddress;
        this.deliveryAddress = address.deliveryAddress;
    }
    
    // Getters and Setters
    public String getShippingAddress() {
        return shippingAddress;
    }
    
    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
    
    public String getDeliveryAddress() {
        return deliveryAddress;
    }
    
    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
    
    
    @Override
    public String toString() {
        return "Address{" +
                "shippingAddress='" + shippingAddress + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                '}';
    }
    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Address address = (Address) obj;
        return shippingAddress.equals(address.shippingAddress) &&
               deliveryAddress.equals(address.deliveryAddress);
    }
}

