package com.acc;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class ProductListDemo {

    public static void main(String[] args) {
        List<product> list = new ArrayList<>();
        list.add(new product(500,"Ayush","Shoes",150000));
        list.add(new product(501,"Sohan","jeans",150));
        list.add(new product(503,"Yash","furniture",20000));
        list.add(new product(504,"Yuvraj sir","electronic",30000000));;
        list.add(new product(505,"Arya","makeup",20000000));

        ListIterator<product> itr = list.listIterator();
        while(itr.hasNext()) {
        	 System.out.println(itr.next()); // ✅ No extra space        	
    }
        while(itr.hasPrevious()) {
       	 System.out.println(itr.previous()); // ✅ No extra space        	
   }


        
    }
}
