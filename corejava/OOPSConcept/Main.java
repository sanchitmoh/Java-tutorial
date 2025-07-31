package OOPSConcept;

import OOPSConcept.Car;


public class Main {
    public static void main(String[] args) {
        // Create a new Car object
        Car myCar = new Car("Toyota", "Corolla");

        // Call the start method on the Car object
        String startMessage = myCar.start(myCar.brand, myCar.model);

        // Print the start message
        System.out.println(startMessage);

        // Print the brand and model of the car


        System.out.println("Brand: " + myCar.brand);
        System.out.println("Model: " + myCar.model);


        // Call the start method with speed
        //
        OOPSConcept.MethodOverloading.Car car = new OOPSConcept.MethodOverloading.Car("Toyota", "Corolla", 120);
        // Calling the start method with two parameters
        String startMessage1 = car.start(car.brand, car.model);
        System.out.println(startMessage1);
        // Calling the start method with three parameters
        String startMessage2 = car.start(car.brand, car.model, car.Speed);
        System.out.println(startMessage2);
    }
}




