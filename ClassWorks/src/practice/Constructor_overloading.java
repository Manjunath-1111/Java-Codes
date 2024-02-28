package practice;

public class Constructor_overloading 
{
	Constructor_overloading(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	Constructor_overloading(double a, int b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	
	Constructor_overloading(double a, double b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	
	Constructor_overloading(short a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	public static void main(String[] args) 
	{
		new Constructor_overloading(2,3);
		new Constructor_overloading(2.5,3);
		new Constructor_overloading(2.5,2.5);
		new Constructor_overloading(20,2);
	}
	
	

}
