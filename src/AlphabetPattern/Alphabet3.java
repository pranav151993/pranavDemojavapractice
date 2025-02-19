package AlphabetPattern;

public class Alphabet3 {

	public static void main(String[] args) {
		
		int n = 5 ;
		int h = 65;
		for (int i =0 ; i<n ; i++)
		
		{
			for (int j =n; j>i;j--)
			
			{	System.out.print(" ");
			
			}

			for (int k=0 ; k<=i ; k++ )
			{
				
				System.out.print((char)(h+i)+" ");
			}
			System.out.println();
		}
			
			
			
	}

}
