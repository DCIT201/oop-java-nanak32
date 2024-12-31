package Test;

import org.junit.jupiter.api.Test;
import src.Car;
import src.Motorcycle;
import src.Truck;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void testCarRentalCost() {
        Car car = new Car("CAR001", "Sedan", 50, true);
        assertEquals(550, car.calculateRentalCost(10));
    }

    @Test
    void testMotorcycleRentalCost() {
        Motorcycle motorcycle = new Motorcycle("MOTO001", "Harley", 30, true);
        assertEquals(210, motorcycle.calculateRentalCost(7));
    }

    @Test
    void testTruckRentalCost() {
        Truck truck = new Truck("TRUCK001", "Freightliner", 100, 20000);
        assertEquals(1100, truck.calculateRentalCost(10));
    }

    @Test
    void testVehicleAvailability() {
        Car car = new Car("CAR001", "Sedan", 50, true);
        assertTrue(car.isAvailableForRental());
    }

    @Test
    void testVehicleNotAvailable() {
        Car car = new Car("CAR001", "Sedan", 50, true);
        car.setAvailable(false);
        assertFalse(car.isAvailableForRental());
    }
}

