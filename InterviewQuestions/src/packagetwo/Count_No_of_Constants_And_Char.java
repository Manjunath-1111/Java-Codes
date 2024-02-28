package packagetwo;
public class Count_No_of_Constants_And_Char {
	public static void main(String[] args) {
	    String line = "Abcdefghijklmnopqrstuvwxyz0123456789";
	    int characters = 0, digits = 0;

	    line = line.toLowerCase();
	    for (int i = 0; i < line.length(); ++i) {
	      char ch = line.charAt(i);

	
	      // check if character is in between a to z
	      if ((ch >= 'a' && ch <= 'z')) {
		        ++characters;
	      }
	      
	      // check if character is in between 0 to 9
	      else if (ch >= '0' && ch <= '9') {
	        ++digits;
	      } 
	    }
	    System.out.println("Vowels: " + characters);
	    System.out.println("Digits: " + digits);
	  }
	}
	

