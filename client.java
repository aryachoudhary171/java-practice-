package com.acc;

public class client {
    public static void main(String[] args) {
        Flyable f;
        int k = 10;

        if (k < 10) {
            f = new kite(); // Capitalized class name
        } else {
            f = new bird(); // Capitalized class name
        }

        f.startToFly();
        f.stopToFly();
        f.accelerate();
    }
}
