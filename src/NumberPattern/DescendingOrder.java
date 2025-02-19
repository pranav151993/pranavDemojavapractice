package NumberPattern;

public class DescendingOrder {

	public static void main(String[] args) {
		
		int a[] = {5,4,9,1};
        int fill ;                         
		
		for (int i =0;i<a.length;i++)
		{                                           
			
		for(int j=i+1;j<a.length;j++ )
		
		{
		if (a[i]<a[j] )
		{
		fill=a[i];
		a[i]=a[j];
		a[j]=fill;
			
		}				
		}	
		}
		for (int b:a)
		System.out.println(b);
		
	}

}
