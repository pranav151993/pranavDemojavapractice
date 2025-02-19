package StringMethods;

public class SplitByDot {

	public static void main(String[] args) {
		
		String s1 = "java.is.very.good.programming.language" ;
		
		String [] s2 = s1.split("\\.");
		
         System.out.println("no of substrings are:-" + s2.length);    
		
         for (int i = 0 ; i<s2.length;i++)
        	 
         {
        	 System.out.println("s1["+i+"] :-" + s2[i]  );
        	 
         }
         
	}

}
