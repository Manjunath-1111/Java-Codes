package practice;

public class Static_method_inside_main_method 

{
   static void add()
   {
	   System.out.println("1");
   }
	
	
	public static void main(String[] args) 
	{
		add();
		System.out.println("2");
		System.out.println("3");
		add();
		
		
		

	}

	
}
