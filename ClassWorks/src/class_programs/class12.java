package class_programs;
public class class12 {

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		if(a>10 || b>a) //or
		{
			int sum=100+a+b;
			System.out.println(sum);
		}
		
		if(a>5 && b>a)//and
		{
			int sum=100-a-b;
			System.out.println(sum);
		}
		if(!(a>10 || b>a)) //or with not
		{
			int sum=111+a+b;
			System.out.println(sum);
		}
		
		if(!(a>5 && b>a)) //and with not
		{
			int sum=110-a-b;
			System.out.println(sum);
		}
	
	}
}
