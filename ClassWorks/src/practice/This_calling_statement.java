package practice;

public class This_calling_statement 
{
	This_calling_statement()
	{	this("Manju");
		System.out.println("M"); //4
	}
	
	This_calling_statement(int a)
	{
		this('M');
		System.out.println(a+10); //2
	}
	This_calling_statement(String a)
	{	this(100);
		System.out.println(a+" Manjunath"); //3
	}
	This_calling_statement(char a)
	{	
		System.out.println('P');  //1
	}
	
	public static void main(String[] args) 
	{
		new This_calling_statement();
	}
}
