package Strings;

public class StringExample {
    public static void main(String[] args) {
        // String is a sequence of characters
        // It is immutable, meaning once created, it cannot be changed
        // String is a class in Java, and it is part of the java.lang package
        // Strings can be created using double quotes or the String class constructor

        // example of creating a string literal
        // this literal store in  the string pool

        String str1 = "Hello";
        System.out.println("String Literal: " + str1);

        // example of creating a string using the String class constructor
        // this object is created in the heap memory
        // this object is not stored in the string pool
         // it is referenced by the variable str2
        String str2 = new String("World");
        System.out.println("String Object: " + str2);







    }
}
