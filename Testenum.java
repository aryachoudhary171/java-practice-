package com.acc;
enum Direction { EAST,WEST,NORTH,SOUTH}
public class Testenum {

	public static void main(String[] args) {
		for(Direction d : Direction.values()) {
			System.out.println(d);
		}
		System.out.println("value of EAST is :="+Direction.valueOf("EAST"));
		System.out.println("value of EAST is :="+Direction.valueOf("EAST").ordinal());
		System.out.println("value of NORTH is :="+Direction.valueOf("NORTH").ordinal());
		System.out.println("value of SOUTH is :="+Direction.valueOf("SOUTH").ordinal());



	}

}
