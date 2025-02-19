package NumberPattern;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int a = 123456789;
	    int reverse = 0;
	
	//	int n = a/10;          //gives output other than reminder
	//	int reminderxcv = a%10;   // gives reminder in output
	//	System.out.println(reminderxcv);  
	//	System.out.println(n);   
		
		
		while(a!=0) {
			
			
			
			int reminder = a%10;      
			reverse =reverse*10+reminder; 
			
			a = a/10;
			
			
		}
		System.out.println(reverse);
		
		
		
	}

}
