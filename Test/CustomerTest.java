package Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.Customer;

class CustomerTest {

    @Test
    void testCustomerCreation() {
        Customer customer = new Customer("CUST001", "John Doe");
        Assertions.assertEquals("CUST001", customer.getCustomerId());
        Assertions.assertEquals("John Doe", customer.getName());
        Assertions.assertEquals(0, customer.getLoyaltyPoints());
    }

    @Test
    void testAddLoyaltyPoints() {
        Customer customer = new Customer("CUST001", "John Doe");
        customer.addLoyaltyPoints(10);
        Assertions.assertEquals(10, customer.getLoyaltyPoints());
    }

    @Test
    void testToStringMethod() {
        Customer customer = new Customer("CUST001", "John Doe");
        Assertions.assertEquals("src.Customer ID: CUST001, Name: John Doe, Loyalty Points: 0", customer.toString());
    }
}
