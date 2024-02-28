package practice;

import class_programs.Package1_Teacher2;

public class Package2_student2 extends Package1_Teacher2
{

	public static void main(String[] args) 
	{
		Package2_student2 t2=new Package2_student2();
		t2.add();     //only public and protected class will access
		t2.mul();     //only public and protected class will access
		// t2.div();  //Default
		// t2.sub();  //Private
				
		}    	

	}
	
