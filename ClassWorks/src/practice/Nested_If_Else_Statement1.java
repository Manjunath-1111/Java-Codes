package practice;

public class Nested_If_Else_Statement1 {

	public static void main(String[] args) {

		int salary=10000;
		char gender='m';
		
		 if(salary>=10000)
		 {
			 
			 if(gender=='m')
				 {
				 System.out.println("True");
				 
				 			if (gender=='F')
				 			{System.out.println("not accepted");}	
				 			
				 			else 
				 			{System.out.println("Accepted");}	
				 				
				 }
				 
			 else
			 {
				 System.out.println("False");
			 }
		
		 }	 
		 else
		 {
			 System.out.println("Invalid");
		 }
	}

}
