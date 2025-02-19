package StringMethods;

public class TrimString {

	public static void main(String[] args) {
		
		
		String  t = "   India012    " ;
		
	
		
		System.out.println(t.trim()+"34Kolhapur");  //with trim- it removes the spaces of t. o/p=>India01234Kolhapur
		
		System.out.println(t + "34Kolhapur");  // without trim.                             o/p=>    India012    34Kolhapur
		
		
		int i = 69;
		
		System.out.println(t.trim()+ i); //string + int  with trim                                   o/p=>India01269
		System.out.println(t + i);       //string + int without trim.                       o/p=>   India012    69   
	}

}
