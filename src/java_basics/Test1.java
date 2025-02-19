package java_basics;

public class Test1 {
	
	String Name;
	int employee_id;
	
	Test1 (String Name,int employee_id)
	{
		this.Name = Name;
		this.employee_id=employee_id;
		
	}
	

	public static void main(String[] args) {
	    
		Test1 z1 = new Test1 ("Pranav",101);
		System.out.println("Employee 1 :" +z1.Name+" "+z1.employee_id );
	}

}
 