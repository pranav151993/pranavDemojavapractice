package StringMethods;

public class StringToCharArry {

	public static void main(String[] args) {
		
		
		String s1 = " i love kolhapur" ;
		
		char[] xyz = s1.toCharArray() ;
		
		for (int i =0 ; i<s1.length(); i++)
		
		{
			System.out.println(xyz[i]);
			
		}
		System.out.println();
		
		// 2nd example
		
		String s3="Welcome to Edureka";
		char[] ch=s3.toCharArray();
		for(int i=0;i<ch.length;i++){
			
		System.out.print(ch[i]);
		}
		
	}

}
