package com.acc;

public class product {

	public static void main(String[] args) {
		details member = new details(); 
		member.setId(1);
		member.setName("Phone");
		member.setPrice(20);
		
		//System.out.println("Product details : " + member.toString());
		
		details details[] = new details[5];
		details[0] = new details(1, "Specs", 200);
		details[1] = new details(2, "Watch", 300);
		details[2] = new details(3, "TV", 400);
		details[3] = new details(4, "Case", 500);
		details[4] = new details(5, "Bottle", 600);
		
		for(details i : details) {
			System.out.println(i);
		}
	
		
	}

}
