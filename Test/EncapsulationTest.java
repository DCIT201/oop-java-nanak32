package Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.*;

class EncapsulationTest {

    @Test
    void testCarSetAvailability() {
        Car car = new Car("CAR001", "Sedan", 50, true);
        car.setAvailable(false);
        Assertions.assertFalse(car.isAvailableForRental());
    }

}
