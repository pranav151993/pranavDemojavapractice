package java_basics;

public class SecondMaxNumberAreay {

	public static void main(String[] args) {
	
		
		int a [] = {10,20,30,25,40};
		
		int dvg ;          
		
		for (int i = 0 ; i<a.length;i++ )
		{                                         
			
			for (int j = i+1; j<a.length; j++)
			         
			{   
				
				if (a[i]> a[j])
				{
				// print in Ascending  order
			dvg = a[i];
			a[i] = a[j];
			a[j] = dvg ;
			
				}
			
			}
		
			
			
		}	
		System.out.println(a[1]);   // 2nd maximum number
		
		for (int p:a)
		{
			System.out.print(p + " ");
			
	
		}
	}

}
