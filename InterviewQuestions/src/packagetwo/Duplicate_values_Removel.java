package packagetwo;

public class Duplicate_values_Removel {
	
	public static void main(String [] args){
        charSingleOccurrence("hhiii!!!  hooowww   aaareee   yyyooou???");
    }
    public static void charSingleOccurrence(String str){
        int i=0;
        int j=0;
        char arr[]=new char[50];
        while (i<str.length()-1) {            
            if(str.charAt(i)!=str.charAt(i+1)){
                arr[j]=str.charAt(i);
                i++;
                j++;
            }else{
                i++;
            }
        }
        arr[j]=str.charAt(str.length()-1);
        for(char c:arr){
            System.out.print(c);
        }
    }

}
