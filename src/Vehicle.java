package src;

public abstract class Vehicle {
        // Private encapsulated fields
        private String vehicleId;
        private String model;
        private double baseRentalRate;
        private boolean isAvailable;

        // Constructors with validation
        public Vehicle(String vehicleId, String model, double baseRentalRate) {
            this.vehicleId = vehicleId;
            this.model = model;
            this.baseRentalRate = baseRentalRate;
            this.isAvailable = true;
        }

        // Getters and setters
        public String getVehicleId() {
            return vehicleId;
        }

        public String getModel() {
            return model;
        }

        public double getBaseRentalRate() {
            return baseRentalRate;
        }

        public boolean isAvailable() {
            return isAvailable;
        }

        public void setAvailable(boolean available) {
            isAvailable = available;
        }

        // Abstract methods for rental calculation
        public abstract double calculateRentalCost(int days);

        public abstract boolean isAvailableForRental();

    @Override
    public String toString() {
        return "src.Vehicle ID: " + vehicleId + ", Model: " + model + ", Base Rate: GHc" + baseRentalRate;
    }

}
