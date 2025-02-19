package StringMethods;

public class SplitByLetter {

	public static void main(String[] args) {
		
		String s1 = "kolhapur is very nice turist place" ;
		
		String[] s2 = s1.split("n");
		
	    System.out.println("no of substrings are := " + s2.length);

	    for (int i = 0 ; i<s2.length ; i++) 
	    {
	    	
	    	System.out.println("s1["+i+"] := " + s2[i]   );
	    }
	    
	    
	}

}
