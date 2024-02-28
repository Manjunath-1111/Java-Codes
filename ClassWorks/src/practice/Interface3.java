package practice;

interface Logic5 
{
	void add();  //abstract method
	void sub();
}
abstract class manju implements Logic5
{
	abstract void mul();  //abstract method
	abstract void div();
	void man() // concrete method
	{
		System.out.println("Manju");
	}
	static void pri()  // concrete method
	{
		System.out.println("Priyanka");
	}
}
public class Interface3 extends manju
{
	public static void main(String[] args) 
	{
		Interface3 i1=new Interface3();
		i1.add();
		i1.sub();
		i1.mul();
		i1.div();
		i1.man();
		pri();
	}	
	public void add() 
	{
		System.out.println("addition");	
	}
	public void sub() 
	{
		System.out.println("Subtraction");	
	}
	void mul() 
	{
		System.out.println("Multiplication");	
	}
	void div() 
	{
		System.out.println("Division");	
	}
}
