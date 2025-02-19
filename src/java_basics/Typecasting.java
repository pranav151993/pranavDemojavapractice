package java_basics;

public class Typecasting {

	public static void main(String[] args) {
		
		
		//widening - Widening Casting (automatically) - converting a smaller type to a larger type size--implicit type casting
		// byte -> short -> char -> int -> long -> float -> double
		
		int a = 25;
		float c = a;
		System.out.println(c); //25.0
		
		byte b = 100 ;
		int d = b ; 
		System.out.println(d);
		
		
		// narrowing
		//Narrowing Casting (manually) - converting a larger type to a smaller size type----explicit type casting
		// double -> float -> long -> int -> char -> short -> byte */
		
		float k= 12.3f;
		int y = (int)k;
		System.out.println(y);  //12
		
		
		long u = 1234566;
		byte i = (byte)u;
		System.out.println(i); //-122
		
		// byte to char , short to char = narrowing
		
		byte fv = 50;
		char tg = (char)fv;
		System.out.println(tg); //2
		
		
		// char to int 
		
		char t = 'L';
		int r = t;
		System.out.println(r);  // 76
	
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
