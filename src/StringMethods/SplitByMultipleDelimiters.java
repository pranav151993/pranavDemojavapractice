package StringMethods;

public class SplitByMultipleDelimiters {

	public static void main(String[] args) {
		
		String s1 = "mangaon. is ,very ! nice village" ;
		
      String [] s2 =  s1.split( "[ , . ! ]+ ");
      
      System.out.println("no of substriings are := " + s2.length );
      
      for (int i = 0;i< s2.length ; i++) 
    	  
      {
    	  System.out.println("s1["+i+" ]  :=" + s2[i] );
      }
      
	}

}
