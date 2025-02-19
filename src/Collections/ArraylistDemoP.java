package Collections;

import java.util.ArrayList;

public class ArraylistDemoP {

	public static void main(String[] args) {
		
		ArrayList<Integer> obj = new ArrayList<Integer>();
		
		obj.add(10);
		obj.add(20);
		obj.add(30);
		//obj.add(null);
		obj.add(20);
		
		System.out.println(obj);     //[10, 20, 30, null, 20]  //to print array we have different ways. Duplicates values are allowed. sequence is fixed.

		obj.add(2,50);              // added 50 at index 2
		
		System.out.println(obj);   //[10, 20, 50, 30, null, 20]
		
		obj.remove(2);            //remove value at index 2.
		System.out.println(obj);  //[10, 20, 30, null, 20]
		
		obj.set(1, 70);           //update value at 1st index.
		System.out.println(obj);   //[10, 70, 30, null, 20]
		
		System.out.println(obj.get(3));  // null  // to fetch value of specific index.
		
		//obj.clear();  to clear all arraylist..
		
		//print Arraylist using for loop
		
		for (int i =0 ; i<obj.size();i++) {
			
			System.out.print(obj.get(i)+" ");			
		}
		
		
		System.out.println("===========================");
		
		
		//print Arraylist using for each loop
		
		for (int k: obj) {
	    System.out.println(k+" ");
		}
		
		//ArrayList -- print by using for looop--

		for(int i=0;i<obj.size();i++) {
		System.out.print(obj.get(i)+" ");

		}
		
	}

}
