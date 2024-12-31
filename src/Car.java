package src;

public class Car extends Vehicle {
    private boolean hasNavigationSystem;

    public Car(String vehicleId, String model, double baseRentalRate, boolean hasNavigationSystem) {
        super(vehicleId, model, baseRentalRate);
        this.hasNavigationSystem = hasNavigationSystem;
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = getBaseRentalRate() * days;
        if (hasNavigationSystem) {
            cost += 5 * days; // Extra charge to be paid for the navigation.
        }
        return cost;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}
