package interview.Questions;

import java.util.Scanner;

public class Find_Largest_Of_Three_Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number");
		int a = sc.nextInt();

		System.out.println("Enter the Secound number");
		int b = sc.nextInt();

		System.out.println("Enter the third number");
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println(a + "is largest number");
		} else if (b > a && b > c) {
			System.out.println(b + " is largest number");

		} else if (c > a && c > b) {
			System.out.println(c + " is largest number");
		}
	}

}
