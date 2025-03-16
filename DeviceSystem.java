// Main class to test the implementation
public class DeviceSystem {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("Philips459", "ON", 25);
        thermostat.displayStatus();
    }
}
// Superclass Device
class Device {
    String deviceId;
    String status;

    // Constructor
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display device status
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass Thermostat
class Thermostat extends Device {
    int temperatureSetting;

    // Constructor
    public Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status); // Call superclass constructor
        this.temperatureSetting = temperatureSetting;
    }

    // Override displayStatus to include temperature setting
    @Override
    public void displayStatus() {
        super.displayStatus(); // Call superclass method
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}
//output
// Device ID: Philips459
//Status: ON
//Temperature Setting: 25°C