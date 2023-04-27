package program.org;

import java.util.Scanner;

public class Reverse_A_Sentence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter reverse words");
		String str = sc.nextLine();
		String rev = "";

		String s[] = str.split(" ");

		for (int i = 0; i < s.length; i++) {
			rev=s[i]+" "+rev;

		}
		System.out.println("Reversed Sentence "+rev);
	}

}
