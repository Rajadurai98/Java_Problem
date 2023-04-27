package interview.Questions;

public class String_Palindrome {
	public static void main(String[] args) {

		String str1 = "kayak", str2 = "";
		str1 = str1.toLowerCase();

		for (int i = str1.length() - 1; i >= 0; i--) {
			str2 = str2 + str1.charAt(i);

		}
		if (str1 == str2) {
			System.out.println("Given string is a palindrome");
		} else {
			System.out.println("Given string is not a palindrome");
		}

	}
}
