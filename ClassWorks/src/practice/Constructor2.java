package practice;

public class Constructor2 
{
	Constructor2(int a)
	{
		System.out.println("here we can perform constructor");
	}
	
	Constructor2()
	{
		System.out.println("here we can't perform constructor");
	}

	public static void main(String[] args) 
	{
		new Constructor2(80000);
		new Constructor2();
		Constructor2 c1=new Constructor2(80000);
		Constructor2 c2=new Constructor2();
	
	}
	
	
	
	
}
