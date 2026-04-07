package Day10_Tasks;

class Vehicle {
    private String engineNumber;     // private
    String type;                     // default
    protected int speed;             // protected
    public String brand;             // public

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void displayVehicle() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Speed: " + speed);
    }
}

// Derived class
class Car extends Vehicle {
    protected int doors;

    public void setCarDetails(String brand, String type, int speed, int doors) {
        this.brand = brand;     // public
        this.type = type;       // default
        this.speed = speed;     // protected
        this.doors = doors;
    }

    public void displayCar() {
        displayVehicle();
        System.out.println("Doors: " + doors);
    }
}

// Another derived class (multi-level inheritance)
class SportsCar extends Car {
    private int topSpeed;

    public void setSportsCarDetails(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void displaySportsCar() {
        displayCar();
        System.out.println("Top Speed: " + topSpeed);
    }
}

// Main class
public class access {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();

        // Using setters
        sc.setEngineNumber("ENG12345"); // private via getter/setter
        sc.setCarDetails("Ferrari", "Petrol", 300, 2);
        sc.setSportsCarDetails(350);

        // Displaying details
        System.out.println("Engine Number: " + sc.getEngineNumber());
        sc.displaySportsCar();
    }
}
