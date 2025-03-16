public class VehicleSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Motorcycle(100, "Petrol", true),// Bike object
                new Car(150, "Petrol", 5),      // Car object
                new Truck(80, "Diesel", 10)  // Truck object
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println();
        }
    }
}

// Base class representing a vehicle
class Vehicle {
    int maxSpeed;
    String fuelType;

    // Constructor to initialize vehicle properties
    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display vehicle details
    void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType);
    }
}

// Derived class representing a car
class Car extends Vehicle {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

// Derived class representing a truck
class Truck extends Vehicle {
    int loadCapacity;

    Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

// Derived class representing a motorcycle
class Motorcycle extends Vehicle {
    boolean hasCarrier;

    Motorcycle(int maxSpeed, String fuelType, boolean hasCarrier) {
        super(maxSpeed, fuelType);
        this.hasCarrier = hasCarrier;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Has Carrier: " + (hasCarrier ? "Yes" : "No"));
    }
}
//output
// Max Speed: 100 km/h, Fuel Type: Petrol
//Has Carrier: Yes
//
//Max Speed: 150 km/h, Fuel Type: Petrol
//Seat Capacity: 5
//
//Max Speed: 80 km/h, Fuel Type: Diesel
//Load Capacity: 10 tons