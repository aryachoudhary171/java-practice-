package com.acc;

public class NumberExceptionDemo {

	public static void main(String[] args) {
		int num=0;
		try {
		 num = Integer.parseInt("ten");
		}catch(NumberFormatException nfe) {
			System.out.println("Parameter should be some number");
		}
		System.out.println(num);

	}

}
