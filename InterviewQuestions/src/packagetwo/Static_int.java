package packagetwo;

public class Static_int {

	public static int sum(int a, int b)
	{
		return a+b;
	}
	public static void main(String[] args) {
		
		int a=6, b=2;
	int s=Static_int.sum(a,b);
System.out.println("sum="+s);
	}

}
