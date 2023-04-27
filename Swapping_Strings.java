package program.org;

public class Swapping_Strings {
	public static void main(String[] args) {
		String str1 = "Good";
		String str2 = "Morning";

		str1 = str1 + str2;
		// 11 //7
		str2 = str1.substring(0, (str1.length() - str2.length()));
		// Good

		// 7
		str1 = str1.substring(str2.length());

		System.out.println("Strings after swapping: " + str1 + " " + str2);
	}

}
