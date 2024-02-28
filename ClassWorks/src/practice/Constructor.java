package practice;

public class Constructor
{

	Constructor()
	{
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Starting of main method");
		new Constructor();
		System.out.println("Ending of main method");
		Constructor c1=new Constructor();
		Constructor c2=new Constructor();
		new Constructor();
	}

}
