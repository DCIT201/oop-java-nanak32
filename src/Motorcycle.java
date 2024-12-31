package src;

public class Motorcycle extends Vehicle {
    private boolean requiresHelmet;

    public Motorcycle(String vehicleId, String model, double baseRentalRate, boolean requiresHelmet) {
        super(vehicleId, model, baseRentalRate);
        this.requiresHelmet = requiresHelmet;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days;
    }

    @Override
    public boolean isAvailableForRental() {
        return false;
    }
}
