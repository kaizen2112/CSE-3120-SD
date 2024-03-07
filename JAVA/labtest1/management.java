import java.util.ArrayList;
import java.util.List;

interface Vehicle {
    void printInfo();
}

class Car implements Vehicle {
    private String model;
    private String make;
    private int year;
    private int capacity;

    public Car(String model, String make, int year, int capacity) {
        this.model = model;
        this.make = make;
        this.year = year;
        this.capacity = capacity;
    }

    public void printInfo() {
        System.out.println("Car : " + model + ",  " + make + ",  " + year + ",  " + capacity);
    }
}

class Truck implements Vehicle {
    private String model;
    private String make;
    private int year;
    private int capacity;

    public Truck(String model, String make, int year, int capacity) {
        this.model = model;
        this.make = make;
        this.year = year;
        this.capacity = capacity;
    }

    public void printInfo() {
        System.out.println("Truckk:  " + model + ", " + make + ", " + year + ", " + capacity);
    }
}

class VehicleFactory {
    static List<Vehicle> createVehicle(String type, String model, String make, int year, int capacity) {
        List<Vehicle> vehicles = new ArrayList<>();
        
        if (type.equals("Car")) {
            vehicles.add(new Car(model, make, year, capacity));
        } else if (type.equals("Truck")) {
            vehicles.add(new Truck(model, make, year, capacity));
        }
        return vehicles;
    }
}

public class management {
    public static void main(String[] args) {
        List<Vehicle> vc = VehicleFactory.createVehicle("Car", "Toyota", "Ferrari", 2022, 5);
        for (Vehicle vehicle : vc) {
            vehicle.printInfo();
        }

        List<Vehicle> vt = VehicleFactory.createVehicle("Truck", "ABC", "EFG", 2022, 8);
        for (Vehicle vehicle : vt) {
            vehicle.printInfo();
        }
    }
}
