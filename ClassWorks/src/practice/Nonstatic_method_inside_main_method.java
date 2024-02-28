package practice;

public class Nonstatic_method_inside_main_method {

	void add() 
	{
		
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}

	void subtract()
	
	{	int a=10;
		int b=20;
		int sub=b-a;
		System.out.println(sub);
	}
	
	static void divide()
	{
		int a=10;
		int b=20;
		int div=b/a;
		System.out.println(div);

	}

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int mul=b*a;
		System.out.println(mul);
		Nonstatic_method_inside_main_method n1=new Nonstatic_method_inside_main_method();
		n1.add();
		n1.subtract();
		divide();
		n1.divide();
		
		
	}	
}
