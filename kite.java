
package com.acc;

public class kite implements Flyable {
    
    @Override
    public void startToFly() {
        System.out.println("Kite is flying");
    }

    @Override
    public void stopToFly() {
        System.out.println("Kite is not flying");
    }

    @Override
    public void accelerate() {
        System.out.println("Kite is accelerating");
    } // Ensure this brace is not missing
}
