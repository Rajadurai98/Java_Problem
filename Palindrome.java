package program.org;

public class Palindrome {
	public static void main(String[] args) {
		String str1="LeVel";
		String str="";
		
		for(int i=str1.length()-1;i>=0;--i) {
			str=str+str1.charAt(i);
		}
		if(str1.toLowerCase().equals(str.toLowerCase())){
			System.out.println(str1 +" its a palindrome ");
		}
		else {
			System.out.println(str1+" its not a palindrome");
		}
	}

}
