package StringMethods;

public class SplitByWhiteSpace {

	public static void main(String[] args) {
		
		String s1 = "my Name is Pranav Prabhakar Awate " ;
		
		String[]s2 = s1.split(" ");
		
		for (int i = 0 ; i<s2.length; i++)
		{
			
			System.out.println("s1["+i+"] :-"+ s2[i] );
		}
		
		
		System.out.println("no of substrings are =>" + s2.length);
		
		
		
	} 

}
