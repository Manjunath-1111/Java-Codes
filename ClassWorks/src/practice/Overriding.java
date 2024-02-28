package practice;

public class Overriding extends over
{
	
  	void add()
	{	
		super.add();  //To call both the methods we use super keyword.
		System.out.println("Priyanka");
		//super.add();
	}
	public static void main(String[] args) 
	{
		Overriding o1=new Overriding();
		o1.add();
	}
}	
	

class over
{
	void add()
	{
		System.out.println("Manju");
	}

}
