package com.acc;
import java.util.Scanner;
public class AgeDefinedDemo {

	public static void main(String[] args) {
		System.out.println("enter the age");
		Scanner sc =new Scanner(System.in);
		int ag=sc.nextInt();
		if(ag<=22 || ag>=60)
			throw new InvalidProductException("Invalid age");
		else
			System.out.println("Welcome to the site");
		
		

	}

}
