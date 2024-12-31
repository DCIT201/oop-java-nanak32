package src;

public class Truck extends Vehicle {
    private double maxLoadCapacity;

    public Truck(String vehicleId, String model, double baseRentalRate, double maxLoadCapacity) {
        super(vehicleId, model, baseRentalRate);
        this.maxLoadCapacity = maxLoadCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days + 10 * days;
    }

    @Override
    public boolean isAvailableForRental() {
        return false;
    }
}
