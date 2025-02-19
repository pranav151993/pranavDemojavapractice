package StringMethods;

public class CompareString {

	public static void main(String[] args) {

		String h = "HELLOW" ;
		String J = "HELOW" ;
		String k = "Pranav" ;
		
		System.out.println(h.compareTo(J));      // here first difference found in L & O .here L is 3 digits ahead of o i.e L M N O  = -3        
		System.out.println(h.compareTo(k));    //   here first difference found in H & P .here h is 8 digits ahead of p i.e HIJKLMNOP  = -8       
		
				                                       // it compares the sequence number of alphhabet
		String s1="hello";
		String s2="hello"; 
		String s3="hemlo"; 
		String s4="flag";
		System.out.println(s1.compareTo(s2)); // 0 because both are equal
		System.out.println(s1.compareTo(s3)); //-1 because "l" is only one time lower than "m" 
		System.out.println(s1.compareTo(s4)); // 2 because "h" is 2 times greater than "f"

		
	}

}
