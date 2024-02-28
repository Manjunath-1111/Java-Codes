package practice;

public class Global_variable {
	
	static int a;
	// a=100; 
	//Not to write like this. we must have to declare and initialize in a single line outside the method
	//OR
	//we have to declare outside the method and initialize inside the method
	static int b=200;
	public static void main(String[] args) 
	{
		a=100;
		a=300;//Updated Global variable
		b=500;//Updated Global variable
		
		int c=a+b;
		System.out.println(c);
		Global_variable g1=new Global_variable ();
		g1.add();	
	}
	int c=200;
	int d;
	void add()
	{
		a=100;
		d=200;
		int e=a+c+d;
		System.out.println(e);
	}
	

}
