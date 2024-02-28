package practice;

abstract class API   // abstract class which has abstract methods in it
{
		abstract void login();  // no implementations example : {};
		abstract void auth();
		abstract void twowayauth();
}

public class Abstract1 extends API
{

	public static void main(String[] args) 
	{
		Abstract1 a1=new Abstract1();
		a1.login();
		a1.auth();
		a1.twowayauth();
		
	}

	
	void login() 
	{
		System.out.println("Logic of Login");
	}

	
	void auth() 
	{
		System.out.println("Logic of Auth");
	}

	
	void twowayauth() 
	{
		System.out.println("Logic of Two way auth");
		
	}

}
