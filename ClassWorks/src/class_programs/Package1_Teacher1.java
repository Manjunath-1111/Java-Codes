package class_programs;

import practice.Access_specifier_within_class1;

public class Package1_Teacher1 {

	public static void main(String[] args) {
		Package1_Teacher1 a1=new Package1_Teacher1(); //Used for both non static and constructor
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();	
	}
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
	public Package1_Teacher1()
	{
		System.out.println("I'm Constructor");
	}
}