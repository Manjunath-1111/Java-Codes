package practice;

public class Global_variable_static_and_nonstatic {

	static int a=100;
	int b=200;
	public static void main(String[] args)
	{
		System.out.println(a);
		Global_variable_static_and_nonstatic g1=new Global_variable_static_and_nonstatic();
		System.out.println(g1.b);
		
	}

}
