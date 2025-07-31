package OOPSConcept.MethodOverloading;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 120);
        // Calling the start method with two parameters
        String startMessage1 = car.start(car.brand, car.model);
        System.out.println(startMessage1);
        // Calling the start method with three parameters
        String startMessage2 = car.start(car.brand, car.model, car.Speed);
        System.out.println(startMessage2);
    }
}
