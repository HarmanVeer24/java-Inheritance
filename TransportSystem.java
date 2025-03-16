// Main class to test the Transport system
public class TransportSystem {
    public static void main(String[] args) {
        // Creating objects of ElectricVehicle and PetrolVehicle
        ElectricVehicle tesla = new ElectricVehicle(200, "Tesla Model X");
        PetrolVehicle mustang = new PetrolVehicle(250, "Ford Mustang");

        // Displaying behavior of both vehicle types
        tesla.charge();
        mustang.refuel();
    }
}

// Superclass Vehicle
class Vehicle {
    int maxSpeed;
    String model;

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

// Interface Refuelable
interface Refuelable {
    void refuel();
}

// Subclass PetrolVehicle
class PetrolVehicle extends Vehicle implements Refuelable {
    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println("Petrol vehicle is refueling.");
    }
}

// Subclass ElectricVehicle
class ElectricVehicle extends Vehicle {
    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void charge() {
        System.out.println("Electric vehicle is charging.");
    }
}
//output
// Electric vehicle is charging.
//Petrol vehicle is refueling.