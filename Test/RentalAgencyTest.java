package Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import src.*;

class RentalAgencyTest {

    @Test
    void testAddVehicleToFleet() {
        RentalAgency rentalAgency = new RentalAgency();
        Car car = new Car("CAR001", "Sedan", 50, true);
        rentalAgency.addVehicle(car);
        assertNotNull(rentalAgency.findAvailableVehicle("Sedan"));
    }

    @Test
    void testProcessRentalSuccessful() {
        RentalAgency rentalAgency = new RentalAgency();
        Car car = new Car("CAR001", "Sedan", 50, true);
        Customer customer = new Customer("CUST001", "John Doe");
        rentalAgency.addVehicle(car);
        rentalAgency.processRental(car, customer, 5);

        Assertions.assertEquals(5, customer.getLoyaltyPoints());
    }

    @Test
    void testProcessRentalUnavailableVehicle() {
        RentalAgency rentalAgency = new RentalAgency();
        Car car = new Car("CAR001", "Sedan", 50, true);
        rentalAgency.addVehicle(car);
        car.setAvailable(false); // Set car to unavailable
        Customer customer = new Customer("CUST001", "John Doe");

        rentalAgency.processRental(car, customer, 5);
        Assertions.assertEquals(0, customer.getLoyaltyPoints());
    }

    @Test
    void testProcessRentalForMotorcycle() {
        RentalAgency rentalAgency = new RentalAgency();
        Motorcycle motorcycle = new Motorcycle("MOTO001", "Harley", 30, true);
        rentalAgency.addVehicle(motorcycle);
        Customer customer = new Customer("CUST001", "Jane Doe");

        rentalAgency.processRental(motorcycle, customer, 7);
        Assertions.assertEquals(0, customer.getLoyaltyPoints());
    }

    @Test
    void testReturnVehicle() {
        RentalAgency rentalAgency = new RentalAgency();
        Car car = new Car("CAR001", "Sedan", 50, true);
        rentalAgency.addVehicle(car);
        rentalAgency.processRental(car, new Customer("CUST001", "John Doe"), 5);

        rentalAgency.returnVehicle(car);
        Assertions.assertTrue(car.isAvailableForRental());
    }
}
