package java_basics;

public class CountOfwords {

	public static void main(String[] args) {
	
		
		
	
	    
	    
	    
		String s="hello java love you";  
		  
	    String[] words= s.split(" "); 
	      
	    // words[]={"hello","java","love","you"} 
	   System.out.println( words.length);  
	   System.out.println("================");
	
	   
	   // i want to find out length for each word--
	   
	      // 0 1 2 3
	   for(int i=0;i<words.length;i++) {
	    System.out.println(words[i].length()); 
	   }
	  
	}

}
