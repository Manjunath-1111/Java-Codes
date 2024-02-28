package practice;

public class Final_variable {

	final static int a=200;
	public static void main(String[] args) 
	{
		//a=300; not possible in final
		final int b=300;
		//b=400; not possible in final
		int sum=a*b;	
		System.out.println(sum);	
	}
}
