package com.acc;

enum Days { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }

public class testdaysofweek {
    public static void main(String[] args) {
        for (Days d : Days.values()) {
            System.out.println(d);
        }

        System.out.println("value of SUNDAY is := " + Days.valueOf("SUNDAY"));
        System.out.println("value of SUNDAY is := " + Days.valueOf("SUNDAY").ordinal());
        System.out.println("value of MONDAY is := " + Days.valueOf("MONDAY").ordinal());
        System.out.println("value of TUESDAY is := " + Days.valueOf("TUESDAY").ordinal());
        System.out.println("value of WEDNESDAY is := " + Days.valueOf("WEDNESDAY").ordinal());
        System.out.println("value of THURSDAY is := " + Days.valueOf("THURSDAY").ordinal());
    }
}
