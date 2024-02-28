package practice;

import class_programs.Package1_Teacher1; //imported from class_programs

public class Package2_Student1 {

	public static void main(String[] args) 
	{
		Package1_Teacher1 t1=new Package1_Teacher1();
		t1.add();
		//t1.sub();     //only public class will access
		//t1.mul();		//only public class will access
		//t1.div();		//only public class will access
	}    	

}
