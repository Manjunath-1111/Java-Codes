package practice;

public class Local_variable {

	public static void main(String[] args) 
	{
		int a=200; //local variable
		int b=300; //local variable
		int sum=b+a; //local variable
		System.out.println(sum + " Local 1");
		add(134);
		Local_variable l1=new Local_variable();
		l1.mul(100);
		//Local_variable l1=new Local_variable();
		
	}
	void mul(int a)
	{
	String name="Manjunath"; //local variable
	System.out.println(name + " local 2");		
	}
	static void add(int a) //local variable
	{
		System.out.println(a+" Local 3");
	}
	/*void sub()
	{
	int a;
	System.out.println(a); // local variable cannot be utilized until unless we initialize it
	}  */

}
