package java_basics;

public class Operators {

	public static void main(String[] args) {
		
		
		
		int a = 5;
		int b = 6;
		System.out.println(a+b);
		
		//increament -decreament
		System.out.println(a++); 
		System.out.println(a); //increament 6
		
		System.out.println(a++ + b++);// 12
		
		System.out.println(a+b);  //14
		
		System.out.println(--b); //7-1=6
		
		// operator
		
		int c = 10;
		int d = 5;
		
		System.out.println(c*d); //50 multiplication
		
		System.out.println(c/d); // 2 division
		
		System.out.println(d%c);  // 5
		
		System.out.println(d/c); // 0 reminder
		
		System.out.println(d-c);  // -5 substraction
		
		//Assignment
		
		int e = 12;
		
		e += 2;
		
		System.out.println(e); //14
		
		e -= 5;
		System.out.println(e); //9
		
		e += 2 ;
		System.out.println(e); // 11
		
		e /= 2;
		System.out.println(e); //5
		
		//Logical operator && -it does not check second condition if first condition is false
		
		int f = 15;
		
		System.out.println(f<12 && f>10); //  //false,true   = false  , here first condition is false hence it will not check second condition.
		
		System.out.println(f<16 && f>17); // true , false  = false  here 2nd  condition is false hence it is false.
		 
		// bitwise operator & - it checks both first and second condition.
		
		System.out.println(f<12 & f>10);  // false&true = false
		
		System.out.println(f<12 || f>10); // or condition - if any one is true then output is true
		// ! reverse the condition
		
		System.out.println(!(f<12 & f>10)); // reverse of false = true
		
		System.out.println(7%5); // modulus- reminder is 2.
		System.out.println(15%8); // reminder is 7
		System.out.println(8%15);  // small value is 8.
		
		int g = 1234;
	System.out.println(g/10);// 123
	
	System.out.println(g%10);  //4
		
		
		

	}

}
