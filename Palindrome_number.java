package interview.Questions;

public class Palindrome_number {
	public static void main(String[] args) {
		int num = 151, reversenum = 0, remainder;
		int originalnum = num;
		while (num != 0) {
			remainder = num % 10;
			reversenum = reversenum * 10 + remainder;
			num=num/10;

		}
		if(originalnum==reversenum) {
			System.out.println(originalnum+" is palindrome");
		}
		else {
			System.out.println(originalnum+" is not palindrome");
		}

	}

}
