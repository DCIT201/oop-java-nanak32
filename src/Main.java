package src;

public class Main {
    public static void main(String[] args) {

        RentalAgency rentalAgency = new RentalAgency();

        Car car = new Car("C0001","Civic", 70, true);
        Motorcycle motorcycle = new Motorcycle("M0001", "Ducati", 50, true);
        Truck truck = new Truck("T0001", "Ford", 200,15000);

        rentalAgency.addVehicle(car);
        rentalAgency.addVehicle(motorcycle);
        rentalAgency.addVehicle(truck);

        Customer customer1 = new Customer("CU001","Esther Kodua");
        Customer customer2 = new Customer("CU002","Kojo Boamah");

        System.out.println("Rental being processed for " + customer1.getName());
        rentalAgency.processRental(car, customer1, 5);

        System.out.println("\nRental being processed for " + customer2.getName());
        rentalAgency.processRental(car, customer2, 3);

        rentalAgency.processRental(motorcycle, customer2, 7);

        System.out.println("\nReturning vehicle for " + customer1.getName());
        rentalAgency.returnVehicle(car);

        rentalAgency.processRental(car, customer2, 10);
    }
}
