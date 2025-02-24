package com.acc;

public class Array {

	public static void main(String[] args) {
		int arr[][] = {
				{1, 3, 5},
				{6, 8, 9},
				{4, 12, 13}
		};
		
		for(int[] nums: arr) {
			for(int num: nums) {
				System.out.print(num + " ");
			}
			System.out.println();
		}

	}

}