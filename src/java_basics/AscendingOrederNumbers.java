package java_basics;

public class AscendingOrederNumbers {

	public static void main(String[] args) {
		
		
		int abc[]= {50,10,40,20,45,30} ;
		
		int temp;
		
		for (int i=0;i<abc.length;i++) {
			
			
			for (int j=1+i;j<abc.length;j++) {
				
				if (abc[i]>abc[j])
				{
					temp=abc[i] ;
					abc[i]=abc[j];
					abc[j]=temp;
					
					
				}
					
					
			}
			
		}
             for(int z:abc)
             {System.out.print(z+" ");}
		
	}
	}