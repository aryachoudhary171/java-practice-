package com.acc;

public class testproduct {

	public static void main(String[] args) {
        try {
            product p1 = new product(101, "John Doe", "Shoes", 5000);
            product p2 = (product) p1.clone(); // Cloning the object

            // Using getter to display values
            System.out.println("Original product: " + p1);
            System.out.println("Cloned product: " + p2);

            // Modifying cloned object using setters
            p2.setName("Jane Doe");
            p2.setPrice(5500);

            System.out.println("After modifying cloned product:");
            System.out.println("Original product: " + p1);
            System.out.println("Cloned product: " + p2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
