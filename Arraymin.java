package com.acc;

public class Arraymin {

	public static void main(String[] args) {
	int arr[]= {100,2,3,4,5,6,7,8,9,10};
	int min=990;
	int max=-50;
	int n=arr.length;
	for(int i=0;i<n;i++) {
		if(arr[i]<min) {
		 min=arr[i];
		}
		if(arr[i]> max) {
			 max=arr[i];
			}

	}
  
	System.out.print("minimum value is "+min);
	System.out.print("maximum value is "+max);
}
}















