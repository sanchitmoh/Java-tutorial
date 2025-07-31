package OOPSConcept.MethodOverloading;

public class Car {
    //Method Overloading:-is a feature that allows a class to have more than one method with the same name, as long as their parameter lists are different.
    int speed;
    public String brand;
    public String model;
    public int Speed;

    public Car(String brand, String model , int Speed) {
        this.brand = brand;
        this.model = model;
        this.Speed = Speed;}

    public String start(String brand, String model) {
        return "The " + brand + " " + model + " is starting.";
    }
    public String start(String brand, String model, int Speed) {
        return "The " + brand + " " + model + " is starting at a speed of " + Speed + " km/h.";
    }
}
