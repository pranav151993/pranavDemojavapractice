package java_basics;

public class Ifelse {

	public static void main(String[] args) {
	
		
		int marks = 35;
		
		if (marks >= 80) { System.out.println("distinction");}
		
		else if (marks >= 65 & marks < 80) {System.out.println("first class");}

		else if (marks>= 40 & marks <65) {System.out.println("second class");}
		
		else {System.out.println("fail");}
	}

}
