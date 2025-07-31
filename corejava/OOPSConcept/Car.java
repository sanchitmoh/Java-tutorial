package OOPSConcept;

public class Car {
    String brand;
    String model;
    String color;

public  Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.color = color;

    }
    public String start(String brand, String model) {
        return "The " + brand + " " + model + " is starting.";

    }


}
