package practice;

abstract class API1
{
	abstract void login();
	abstract void otp();
	static void sub()
	{
		System.out.println("Static concrete method inside abstract class");
	}
}

abstract class API2 extends API1

{
	abstract void logout();
	void add()
	{
		System.out.println("Non Static concrete method inside abstract class");
	}
}

public class Abstract2 extends API2
{
	public static void main(String[] args) 
	{
		Abstract2 a1=new Abstract2();
		a1.login();
		a1.otp();
		a1.logout();
		a1.add();
		sub();
	}
	
	void logout() 
	{
		System.out.println("Logic for logout");
	}
	
	void login() 
	{
		System.out.println("Logic for Login");
	}
	
	void otp() 
	{
		System.out.println("Logic for OTP");
	}
}
