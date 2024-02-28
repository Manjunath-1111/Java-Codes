package practice;

public class Or_Operator {

	public static void main(String[] args) {
		
		int a=100, b=200, c=200;
		
	if(a>b || b!=c)  //F || F = F it will not show the answer
			
		{
			System.out.println("False");
		}
		
	if(a<b || b==c)  //T || T = T it will show the answer as True
			
		{
			System.out.println("True");
		}
		
	}

}
