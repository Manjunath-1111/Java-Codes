package packagetwo;

public class a2b3c4 {

	public static void main(String[] args) {
	    String s ="A2B3C4D5E6";
	    for(int i =0; i < s.length(); i++) {
	        if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
	            System.out.print(s.charAt(i));
	        }else{
	            int a = s.charAt(i)-48;
	            
	            for(int j =1; j <a; j++) {
	                System.out.print(s.charAt(i-1));
	            }
	        }
	    }
	    }}
