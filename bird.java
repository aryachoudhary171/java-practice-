package com.acc;

public class bird implements Flyable { // Capitalized class name

    @Override
    public void startToFly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void stopToFly() {
        System.out.println("Bird is not flying");
    }

    @Override
    public void accelerate() {
        System.out.println("Bird is accelerating"); // Ensure no hidden characters
    } // Properly closed brace
}
