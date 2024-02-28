package practice;

interface Logic8
{
	void add();
	void sub();
}
interface Logic7 
{
	void mul();
	void div();
}

public class Interface_multiple_level_Inheritance implements Logic7,Logic8
{
	public static void main(String[] args)
	{
		Interface_multiple_level_Inheritance i1=new Interface_multiple_level_Inheritance();
		i1.add();
		i1.mul();
		i1.sub();
		i1.div();
	}
	public void add() 
	{
		System.out.println("Addition");
	}
	public void sub() 
	{
		System.out.println("Subtraction");
	}
	public void mul() 
	{
		System.out.println("Multiplication");
	}
	public void div()
	{
		System.out.println("Division");
	}
}
