package com.acc;
import java.util.Scanner;
public class UserDefinedDemo {

	public static void main(String[] args) {
		System.out.println("enter the product wt");
		Scanner sc =new Scanner(System.in);
		int wt=sc.nextInt();
		if(wt<100)
			throw new InvalidProductException("product wt is < 100");
		else
			System.out.println("perfectly valid product");
		
		

	}

}
