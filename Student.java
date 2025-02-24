package com.acc;

class Emp {
    int id;
    String name;
    int marks;
    String address;
    
    
    static int count = 0;

    // Constructor
    public Emp(int id, String name, int marks, String address) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.address = address;
        count++; 
        }

    // Method to display employee details
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks + ", Address: " + address);
        System.out.println("Total objects: " + count);
    }
}

public class Student {
    public static void main(String[] args) {
        // Initializing Employee array
        Emp[] s = new Emp[4];
        s[0] = new Emp(101, "Arya", 99, "Satara");
        s[1] = new Emp(102, "XYZ", 98, "Katraj");

        // Displaying employee details
        for (int i = 0; i < s.length; i++) {
            if (s[i] != null) {
                s[i].display();
            }
        }
    }
}
