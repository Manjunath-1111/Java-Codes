package class_programs;

public class Multi_level_inheritance extends inheritance
{  
	static void rem()
	{
		System.out.println("Reminder");
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		div();
		mul();
		rem();	
	}
	
}

class Multi
{	
	static void add()
	{
		System.out.println("Addition");
	}
	static void sub()
	{
		System.out.println("Subtraction");
	}
}

class Level extends Multi
{
	static void mul()
	{
		System.out.println("Multiplication");
	}
}

class inheritance extends Level
{
	static void div()
	{
		System.out.println("Division");
	}
}
