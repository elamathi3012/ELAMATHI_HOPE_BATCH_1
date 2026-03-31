class Car {
    
    private String brand;
    private String model;
    private int year;

    
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

  
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        
        car.setBrand("Toyota");
        car.setModel("Camry");
        car.setYear(2022);

        
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
    }
}