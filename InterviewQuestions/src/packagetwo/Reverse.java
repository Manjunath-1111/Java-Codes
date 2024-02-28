package packagetwo;
public class Reverse {
	public static String reverse(String input) {
        if (input == null) return null;
        StringBuilder output = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            output.append(input.charAt(i));
        }
        return output.toString();
    }
    public static void main(String[] args){
        String text = "educative";
        System.out.println("Original string - " + text);
        System.out.println("Reversed string - " + reverse(text));
    }
}

	
	
	


