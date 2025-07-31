package Conversion;

public class Conversion {
    public static void main(String[] args) {
         int age = 25;
         double height = 5.9;

         int y = (int) height; // Convert double to int

        System.out.println("The age of the student is " + age + " and height is " + y + " cm");

         String name = "Alex";
         System.out.println("The name of the student is " + name);

         // Example of converting a double to a string
         String heightString = String.valueOf(height);
         System.out.println("Height as string: " + heightString);

         // Example of converting an int to a string
         String ageString = Integer.toString(age);
         System.out.println("Age as string: " + ageString);

            // Example of converting a string to an int
            String ageInput = "30";
            int ageFromString = Integer.parseInt(ageInput);
            System.out.println("Converted age from string: " + ageFromString);

            //type of conversion
            // Implicit conversion (widening)
        // int to float
        double d = 1.2f; // float to double
            System.out.println("Implicit conversion: " + d);

            // Explicit conversion (narrowing)


    }
}
