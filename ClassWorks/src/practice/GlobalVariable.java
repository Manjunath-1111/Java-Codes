package practice;
public class GlobalVariable 
{
	int age;
	String name;
	double salary;
	void add(int age,String name,double salary)
	{
		System.out.println(age);
		System.out.println(name);
		System.out.println(salary);
	}
	public static void main(String[] args) 
	{
		GlobalVariable g1=new GlobalVariable();
		g1.add(78, "Ram", 8574.32);
		System.out.println(g1.age);
		System.out.println(g1.name);
		System.out.println(g1.salary);
		
	}

}
