package StringMethods;

public class EqualsIgnoreCase {

	public static void main(String[] args) {
		
		
		String s1 = "PRANAV" ;
		 
		String s2 = "pranav" ;
		
		String s3 = "india" ;
		
		System.out.println(s1.equalsIgnoreCase(s2));   //TRUE
		
		System.out.println(s2.equalsIgnoreCase(s3));  //false

	}

}
