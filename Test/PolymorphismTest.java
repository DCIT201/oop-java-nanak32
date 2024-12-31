package Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.*;

class PolymorphismTest {

    @Test
    void testPolymorphism() {
        RentalAgency rentalAgency = new RentalAgency();
        Vehicle car = new Car("CAR001", "Sedan", 50, true);
        Vehicle motorcycle = new Motorcycle("MOTO001", "Harley", 30, true);
        Vehicle truck = new Truck("TRUCK001", "Freightliner", 100, 20000);

        rentalAgency.addVehicle(car);
        rentalAgency.addVehicle(motorcycle);
        rentalAgency.addVehicle(truck);


        Customer customer = new Customer("CUST001", "John Doe");

        rentalAgency.processRental(car, customer, 5);
        rentalAgency.processRental(motorcycle, customer, 3);
        rentalAgency.processRental(truck, customer, 2);

        Assertions.assertEquals(5, customer.getLoyaltyPoints());
    }
}
