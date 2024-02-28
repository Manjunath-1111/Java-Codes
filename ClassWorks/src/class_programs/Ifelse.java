package class_programs;

public class Ifelse {

	public static void main(String[] args)
	{
		int a=100;
		int b=200;
		
		if (a<b)
		{
			System.out.println("parent if condition");
			
			if (a>b)
			{
				System.out.println("child if condition");
			}
			else
			{
				System.out.println("child else condition");
			}}
			
		else
		{
			System.out.println("parent else condition");
		}
		
		if (a==b)
		{
			System.out.println("2nd child");
		}
		else
			
		{
			System.out.println("2nd else");
		}
		}
		
	}


