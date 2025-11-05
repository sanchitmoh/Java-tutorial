package com.mavenJava.Lamda;

@FunctionalInterface
interface Drawable {
    public void draw(int width);
}

public class Lamda {
    public static void main(String[] args) {
        int width = 10;

        // Without lambda, Drawable implementation using anonymous class
        Drawable drawable = new Drawable() {
            @Override
            public void draw( int width) {
                System.out.println("Drawing " + width);
            }
        };
        drawable.draw(width);

        // With lambda expression
        Drawable drawableLambda = (w) -> System.out.println("Drawing " + width);
        drawableLambda.draw(width);
    }
}
