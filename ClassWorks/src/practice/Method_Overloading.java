package practice;

public class Method_Overloading 
{
	void add(int a)
	{
		int sum=a+100;
		System.out.println(sum);
	}
	
	void add(int c,int d)
	{
		int mul=c*d;
		System.out.println(mul);
	}
	
	static void add(double a, int b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) 
	{
		Method_Overloading m1=new Method_Overloading();
		m1.add(500);
		m1.add(10,20);
		add(10.10,10);
	}
}
