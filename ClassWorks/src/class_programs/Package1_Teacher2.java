package class_programs;

public class Package1_Teacher2 {

/*	public static void main(String[] args) {
		Package1_Teacher2 a1=new Package1_Teacher2(); //Used for both non static and constructor
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();	
	}                       */
	public void add()
	{
		System.out.println("I'm Public");
	}
	private void sub()
	{
		System.out.println("I'm Private");
	}
	protected void mul()
	{
		System.out.println("I'm Protected");
	}
	void div()
	{
		System.out.println("I'm Default");
	}	
	public Package1_Teacher2()
	{
		System.out.println("I'm Constructor");
	}
}