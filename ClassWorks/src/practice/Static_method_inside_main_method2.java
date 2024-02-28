package practice;

public class Static_method_inside_main_method2 
{
	static void add()
	{
		System.out.println("Addition");
	}
	
	static void subtract()
	{
		System.out.println("Subtraction");
	}
	
	public static void main(String[] args) 
	{
		multiply();
		divide();
		System.out.println("Starting");
		add();
		subtract();
	}
	
	static void multiply()
	{
		System.out.println("Multiplication");
	}
	
	static void divide()
	{
		System.out.println("Division");
	}

}
