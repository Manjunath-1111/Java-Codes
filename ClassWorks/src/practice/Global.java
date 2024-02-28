package practice;

public class Global {

	int a=100;
	
	double b=120;
	
	 void add() {
		a=300;
		a=500;
		int a=500,b=200;
		a=700;
		a=900;
		int sum=a+b;
		System.out.println(sum);
		
	}
	public static void main(String[] args) {
		{
			Global g1=new Global();
			g1.add();
			System.out.println(g1.a);
			System.out.println(g1.b);
			System.out.println(g1.a);
		}
		
		
	}
	

}
