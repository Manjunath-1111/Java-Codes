package practice;

interface Logic1
{
	void add();
	void sub();
}
interface Logic2 extends Logic1
{
	void mul();
	void div();
}
public class Interface2 implements Logic2
{
	public static void main(String[] args) 
	{
		Interface2 i1=new Interface2();
		i1.add();
		i1.sub();
		i1.mul();
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
