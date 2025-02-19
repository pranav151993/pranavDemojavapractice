package AlphabetPattern;

public class PrintAlphabet1 {

	public static void main(String[] args) {
	
		
		int s = 12;
		
		int w = 65;
		
		for (int i = 0 ; i<=s;i++) 
		{
			
			for (int j =0; j<i ; j++  ) 
			{
				System.out.print((char)(w+j)+" ");
				
				
			}
			System.out.println( );
		}
	
	}

}
