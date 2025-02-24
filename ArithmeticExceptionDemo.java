package com.acc;

public class ArithmeticExceptionDemo {

    public static void main(String[] args) {
        int num = 10, result = 0;
        String name = null;
        try {
            result = num / 5; // No exception here
            System.out.println(name.length()); // NullPointerException will be thrown
            
            throw new ArithmeticException("Number should not be divided by zero"); // Unreachable statement
        } 
        catch (NullPointerException ae) { // Handle NullPointerException first
            System.out.println(ae.toString());
            System.out.println("String should not be null");
        }
        catch (ArithmeticException ae) { // ArithmeticException handle karega
            ae.printStackTrace();
        }
        finally {
            System.out.println("finally block will always be executed.");
        }

        System.out.println("Result = " + result);
    }
}
