package inheritance;

class Inheritance2
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
class Inheritance3 extends Inheritance2
{
	static void div()
	{
		System.out.println("Division");
	}
	static void rem()
	{
		System.out.println("Reminder");
	}
	
}

public class Inheritance1 extends Inheritance3
{
	static void mul()
	{
		System.out.println("Multiplication");
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();
		rem();
	}
	
}

