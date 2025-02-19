package Collections;

public class intersectionOfArray {

	public static void main(String[] args) {
	
		int abc[]= {1,2,3,4,5};
		
		int xyz[]= {4,5,6,7,8,9};
		
	System.out.println("print intersection of arrays");
		   
		for (int i=0;i<abc.length;i++) {
			
			for(int j=0; j<xyz.length;j++)
		
			if(abc[i]==xyz[j]) {
				
			System.out.println(abc[i]);	
				
				
			}
		}

	}

}
