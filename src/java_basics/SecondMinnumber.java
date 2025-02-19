package java_basics;

public class SecondMinnumber {

	public static void main(String[] args) {
		
		
		
		int a [] = {10,20,30,25,40};
		
		int d ;          
		
		for (int i = 0 ; i<a.length;i++ )
		{                                         
			
			for (int j = i+1; j<a.length; j++)
			         
			{   
				if (a[i]< a[j]) {
				// print in descending order
			d = a[i];
			a[i] = a[j];
			a[j] =  d ;
				}
			}
		
		}	
		System.out.println(a[1]);   // 2nd maximum number
		
		for (int p:a)
		{
			System.out.print(p + " ");
		
		}
	}

	{

	}

	}
