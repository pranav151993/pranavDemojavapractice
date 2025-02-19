package StringMethods;

public class StringSplittBYComma {

	public static void main(String[] args) {
		
		String s1 = "Today's , date , is , 24th december 2023 ,  isn't it? " ;
		
        String [] s2  = s1.split(" , ");           // it means split the string wherever , is used.
		
        System.out.println("no of substrings are = " + s2.length  );
        
        for (int i =0;i<s2.length ; i++)
        
        System.out.println( "s1 [" + i +"]  :" + s2[i]  );
        
	}

}
