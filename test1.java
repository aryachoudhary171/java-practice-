package com.acc;

public class test1 {

	public static void main(String[] args) {
        try {
            Employee emp1 = new Employee(101, "John Doe", "123 Street, NY", 50000);
            Employee emp2 = (Employee) emp1.clone(); // Cloning the object

            // Using getter to display values
            System.out.println("Original Employee: " + emp1);
            System.out.println("Cloned Employee: " + emp2);

            // Modifying cloned object using setters
            emp2.setName("Jane Doe");
            emp2.setSalary(55000);

            System.out.println("After modifying cloned employee:");
            System.out.println("Original Employee: " + emp1);
            System.out.println("Cloned Employee: " + emp2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
