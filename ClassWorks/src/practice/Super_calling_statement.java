package practice;

class City
{
	City()
	{
		System.out.println("1");
	}
	City(int a)
	{	
		System.out.println("2");
	}
}
class State extends City
{
	State()
	{
		super(100);
		System.out.println("3");
	}
	State(double b)
	{  
		System.out.println("4");
	}
}
public class Super_calling_statement extends State
{
	public static void main(String[] args) 
	{	
		Super_calling_statement s1=	new Super_calling_statement ();
		Super_calling_statement s4=	new Super_calling_statement ("Manju");
		
	}
	Super_calling_statement()
	{
		super(100.1100);
		System.out.println("5");
	}
	Super_calling_statement(String c)
	{  
		System.out.println("6");
	}
}
