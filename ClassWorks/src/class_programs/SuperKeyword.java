package class_programs;

public  class SuperKeyword extends over {   //child class can be final
	
  	void add()//child method can be final
	{	
		super.add();  //To call both the methods we use super keyword.
		System.out.println("Priyanka");
		super.add();
	}
	public static void main(String[] args) 
	{
		SuperKeyword o1=new SuperKeyword();
		o1.add();
	}
}	
	 class over   //parent class cannot be final
{
		 void add()//parent method cannot be final
	{
		System.out.println("Manju");
	}

}
