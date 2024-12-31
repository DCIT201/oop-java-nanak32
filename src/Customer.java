package src;

public class Customer {
    private String customerId;
    private String name;
    private int loyaltyPoints;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.loyaltyPoints = 0;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void addLoyaltyPoints(int points) {
        loyaltyPoints += points;
    }

    @Override
    public String toString() {
        return "src.Customer ID: " + customerId + ", Name: " + name + ", Loyalty Points: " + loyaltyPoints;
    }
}
