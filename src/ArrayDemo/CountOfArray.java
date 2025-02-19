package ArrayDemo;

import java.util.Arrays;

public class CountOfArray {

	public static void main(String[] args) {
	
		
		int arr[] = {0,1,0,0,1,0,1,0,1};
		
		int count = 0;

		System.out.println(count);
		
		
		 for (int i = 0; i < arr.length; i++) { 
	            if (arr[i] == 1) 
	                count++; 
	        	System.out.print(count);	        	
		 }
		 
		 for (int i = 0 ; i< count;i++)
		 {
			 arr[i]=1;
			 
		 }
		 
		 for (int i = count; i<arr.length ;i++) {
			 
			 arr[i]=0;
		 }
		 
		 System.out.println(Arrays.toString(arr));
	}
	
	
	

}
