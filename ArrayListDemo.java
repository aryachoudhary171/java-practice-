package com.acc;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(500,"Ayush","pune",150000));
        list.add(new Employee(501,"Sohan","kharadi",150));
        list.add(new Employee(503,"Yash","khopoli",20000));
        list.add(new Employee(504,"Yuvraj sir","kolhapur",30000000));;
        list.add(new Employee(505,"Arya","Banglore",20000000));

        ListIterator<Employee> itr = list.listIterator();
        while(itr.hasNext()) {
        	 System.out.println(itr.next()); // ✅ No extra space        	
    }
        while(itr.hasPrevious()) {
       	 System.out.println(itr.previous()); // ✅ No extra space        	
   }


        
    }
}
