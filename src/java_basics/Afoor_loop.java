package java_basics;

public class Afoor_loop {

	public static void main(String[] args) {

		// print a name five times

		int i = 5;

		for (i = 1; i <= 5; i++) {
			System.out.println("java is good");
		}

		for (int k = 0; k < 5; k++) {
			System.out.println("hello" + " " + k);
		}
		// PRINT 0 TO 25 IN REVERSE ORDER

		int a = 25;

		for (a = 25; a >= 0; a--) {
			System.out.println(a);
		}

		// print name & even no from 0 to 10

		int b = 2;
		for (b = 2; b <= 10; b = b + 2) {
			System.out.println("pranav" + " " + b);

		}

		// print odd & name no from 1 to 10 
		
		int c = 1 ;
		
		for (c = 1 ; c<= 10 ; c = c+2)
		{ System.out.println("pune" +" "+ c );
			
			
		}
		
		//print even and odd no.from 0 to 100
		
		int d = 0 ;
		
		for (d = 0 ; d <=100 ; d++) {
			
			if (d%2 == 0) {System.out.println( d  +" "+ "is even" );}
			
			else {System.out.println( d  +" "+  "is odd ");}
			
			
		}
		
		
		
		
		
		
	}

}
