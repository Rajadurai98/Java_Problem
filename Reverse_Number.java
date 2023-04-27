package interview.Questions;

public class Reverse_Number {
	public static void main(String[] args) {
		int num = 321, reverse = 0, digit;
		while (num != 0) {
			digit = num % 10;
			
			reverse = reverse * 10 + digit;
			num = num / 10;

		}
		System.out.println(reverse);
	}
}
