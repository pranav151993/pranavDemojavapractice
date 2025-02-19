package StringMethods;

public class Replace {

	public static void main(String[] args) {
		
		String s1 = "Hello lucky,i love lonavala" ;
		
		String s2 = s1.replace( "l" , "k") ;  // replace character l with k -  Hekko kucky,i kove konavaka
		 
		String s3 = s1.replace( "love" , "hate") ;  //replace word love with hate.- Hello lucky,i hate lonavala
		
		String s4 = s1.replace( "l" , "you") ; // replace character i with you.- Heyouyouo youucky,i youove youonavayoua
		
	
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
	
		
		

	}

}
