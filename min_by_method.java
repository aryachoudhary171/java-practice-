package com.acc;

import java.util.Scanner;

public class min_by_method {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.println("elements in array:");
		for(int i=0;i<arr.length;i++) {
			arr[i] = s.nextInt();
			
		}
		System.out.println("min value in the arry"+ "\n"+getMin(arr));
		System.out.println("min value in the arry"+ "\n" + getMax(arr));

		
	}
	
	static int getMin(int arr[]){
		int min = 999;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				
				
			}
		
	}
		return min;
		

}
	static int getMax(int arr[]){
		int max = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				
				
			}
		
	}
	  return max;
	}
}
