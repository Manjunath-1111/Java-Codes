package practice;

interface Amazon
{
	void login();
	void logout();
}

public class Interface1 implements Amazon
{
	public void login() 
	{
		System.out.println("Logic to login");	
	}
	public void logout() 
	{
		System.out.println("Logic to logout");
	}
	
	public static void main(String[] args) 
	{
		Interface1 i1=new Interface1();
		i1.login();
		i1.logout();
	}
}
