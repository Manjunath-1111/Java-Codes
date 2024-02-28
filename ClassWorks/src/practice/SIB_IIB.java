package practice;
public class SIB_IIB {
	
	static{	System.out.println("SIB1");}

	public static void main(String[] args) 
	{
		int a=100;
		int b=200;
		new SIB_IIB();
		System.out.println(a+b);
		
		//SIB_IIB s1=new SIB_IIB(10);
	}
	static
	{System.out.println("SIB2");}
	SIB_IIB(){System.out.println("Constructor");
	}
	{System.out.println("IIB1");}
	{System.out.println("IIB2");}
	{System.out.println("IIB3");}
	{System.out.println("IIB4");}
}

