package com.acc;

import java.util.Scanner; 

interface AbstractMethod {
    void speak();
}

class Rat implements AbstractMethod {
    @Override
    public void speak() {
        System.out.println("Rat says Squeak!");
    }
}

class Cat implements AbstractMethod {
    @Override
    public void speak() {
        System.out.println("Cat says Meow!");
    }
}

class Frog implements AbstractMethod {
    @Override
    public void speak() {
        System.out.println("Frog says Ribbit!");
    }
}

public class interface_ { 
    public static void chooseClass(int k) {
        AbstractMethod animal;

        if (k < 10) {
            animal = new Cat();
        } else if (k == 10) {
            animal = new Frog();
        } else {
            animal = new Rat();
        }

        animal.speak();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Enter a value for k: ");
        int k = scanner.nextInt(); 
        chooseClass(k); 
        
    }
}
