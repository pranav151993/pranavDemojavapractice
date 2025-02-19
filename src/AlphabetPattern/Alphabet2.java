package AlphabetPattern;

public class Alphabet2 {

	public static void main(String[] args) {
	
		
		int n = 5;
		int k = 65;
		
		for (int i = 0; i<=n ; i++)
		{
			
			
		{
			for (int j =n; j>i ;j--)
			System.out.print(" ");
		}
		
		for (int j =0 ; j<= i; j++)
		{
				
			System.out.print((char)(k+j)+" " );
		}
		System.out.println();
		}
	

	}

}
