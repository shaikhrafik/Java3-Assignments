package assignmentjava3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class User {
    private int userId;
    private String userName;
    private Address address;
    private String userPassword;
    private String userRealName;
    private LocalDateTime lastLoginTime;
    private String mobileNumber;
    private LocalDate dob;
    
    // Default constructor
    public User() {
        this.userId = 0;
        this.userName = "";
        this.address = new Address();
        this.userPassword = "";
        this.userRealName = "";
        this.lastLoginTime = LocalDateTime.now();
        this.mobileNumber = "";
        this.dob = LocalDate.now();
    }
    
    // Parameterized constructor
    public User(int userId, String userName, Address address, String userPassword, 
                String userRealName, LocalDateTime lastLoginTime, String mobileNumber, LocalDate dob) {
        this.userId = userId;
        this.userName = userName;
        this.address = address;
        this.userPassword = userPassword;
        this.userRealName = userRealName;
        this.lastLoginTime = lastLoginTime;
        this.mobileNumber = mobileNumber;
        this.dob = dob;
    }
    
   
    
    // Getters and Setters
    public int getUserId() {
        return userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public Address getAddress() {
        return address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
    
    public String getUserPassword() {
        return userPassword;
    }
    
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    
    public String getUserRealName() {
        return userRealName;
    }
    
    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }
    
    public LocalDateTime getLastLoginTime() {
        return lastLoginTime;
    }
    
    public void setLastLoginTime(LocalDateTime lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
    
    public String getMobileNumber() {
        return mobileNumber;
    }
    
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    
    public LocalDate getDob() {
        return dob;
    }
    
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    
    // Method to display user details
    public void displayUserDetails() {
        System.out.println("User ID: " + userId);
        System.out.println("Username: " + userName);
        System.out.println("Real Name: " + userRealName);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Last Login: " + lastLoginTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println("Shipping Address: " + address.getShippingAddress());
        System.out.println("Delivery Address: " + address.getDeliveryAddress());
    }
    
    
    public void displayUserDetails(boolean includePrivateInfo) {
        if (includePrivateInfo) {
            System.out.println("Detail User Info");
            displayUserDetails();
           
            System.out.println("Password: " + userPassword.replaceAll(".", "*"));
        } else {
            System.out.println("User: " + userName + " (" + userRealName + ")");
            System.out.println("Last Login: " + lastLoginTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        }
    }
    
   
    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userRealName='" + userRealName + '\'' +
                ", lastLoginTime=" + lastLoginTime +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", dob=" + dob +
                '}';
    }
    
   
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        User user = (User) obj;
        return userId == user.userId;
    }
}

