package java_basics;

public class StringMethods {
	
	
	public static void main (String[]args)
	{

		//length starts with 1 
		//index starts with 0
		
		String a = "My name is pranav" ;
		
		
		// to find character at specific index
		
		char p = a.charAt(5);  // m
		
		System.out.println(p);
		
		// concat= to connect two string methods
		
		String b = "Pranav" ;
		String c = "Awate" ;
		
		// using + operator 
		
		String d = b + " " + c ;
		System.out.println(d);    //Pranav Awate  
		
		//using concat method
		
		String e = b.concat(c);
		System.out.println(e);   //PranavAwate
		
		//substring- to print spectifc part of string, begin index -start & End index- end
		
		String f =  "i love kolhapur" ;
	 System.out.println(f.substring(7,13)); //kolhap
	 
	 //equalignorecase -to ignore small/capital letter and validate
	 
	 String abc = "maharashtra";
	 String xyz = "MahaRashTra";
	 
	 System.out.println (abc.equalsIgnoreCase(xyz)); //true
	 
	 //equals- detect small/capital letter and validate
	 
	 String dr = "maharashtra";
	 String br = "MahaRashTra";
	 System.out.println(dr.equals(br));  // false
	 
	 //contains - to validate data of one string present in other string.its Case sensitive
	 
	 String tr = "i love India";
	 String ul= "India";  
	 
	System.out.println( tr.contains(ul)); // true
	
	// trim - to remove starting and ending spaces.
	
	String g = "   bhola    ";
	System.out.println(g.trim());  //bhola
	
	//replace- to replace data of string
	
	String h = "ram eat mango" ;
	System.out.println(h.replace("ram", "sham"));  // sham eat mango


	
	}	

}
