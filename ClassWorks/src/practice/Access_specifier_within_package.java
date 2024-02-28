package practice;

class Access_specifier
{
	public static void add()
	{
		System.out.println("I'm Public");
	}
	private static void sub()
	{
		System.out.println("I'm Private");
	}
	protected static void mul()
	{
		System.out.println("I'm Protected");
	}
	static void div()
	{
		System.out.println("I'm Default");
	}	
}
public class Access_specifier_within_package extends Access_specifier {

	public static void main(String[] args) 
	{
		add();
		//sub();
		mul();
		div();
	}
}
