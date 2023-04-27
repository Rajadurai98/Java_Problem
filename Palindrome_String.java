package program.org;

public class Palindrome_String {
	public static void main(String[] args) {
		String str = "radar";
		String str1 = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			str1=str1+str.charAt(i);
		}
		if(str.toLowerCase().equals(str1.toLowerCase())) {
			System.out.println(str+" is a Palindrome String");
		}
		else {
			System.out.println(str+" is not a palindrome String");
		}
	}
}