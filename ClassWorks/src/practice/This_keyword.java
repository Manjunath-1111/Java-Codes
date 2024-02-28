package practice;

public class This_keyword {

	int age;
	String name;
	double salary;
	
	void student(int age,String name,double salary)
	{	this.age=age;
		this.name=name;
		System.out.println("Student details as follows");
	}
	
	public static void main(String[] args) 
	{
		This_keyword t1=new This_keyword();
		t1.student(22, "Manju",100.202);
		System.out.println(t1.age);   // used this keyword it shows local assigned value
		System.out.println(t1.name);  // used this keyword it shows local assigned value
		System.out.println(t1.salary); //not used this keyword it shows global default value
		
	}

}
