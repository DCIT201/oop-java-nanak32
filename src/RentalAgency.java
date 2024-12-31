package src;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> fleet;

    public RentalAgency() {
        fleet = new ArrayList<Vehicle>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public Vehicle findAvailableVehicle(String model) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.getModel().equalsIgnoreCase(model) && vehicle.isAvailableForRental()) {
                return vehicle;
            }
        }
        return null;
    }

    public void processRental(Vehicle vehicle, Customer customer, int days){
        if (vehicle.isAvailableForRental()) {
            double cost = vehicle.calculateRentalCost(days);
            vehicle.setAvailable(false);
            customer.addLoyaltyPoints(days);
            System.out.println(vehicle + " rented to " + customer + " with cost GHc" + cost);
        } else {
            System.out.println("src.Vehicle is not available");
        }
    }

    public void returnVehicle(Vehicle vehicle) {
        vehicle.setAvailable(true);
        System.out.println(vehicle + " returned successfully.");
    }
}
