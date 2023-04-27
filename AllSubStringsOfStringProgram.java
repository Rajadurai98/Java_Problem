package program.org;

import java.util.Scanner;

public class AllSubStringsOfStringProgram {
	public static void printAllSubstrings(String inputString) {
		System.out.println("All possible substrings of " + inputString + " are : ");
		for (int i = 0; i < inputString.length(); i++) {
			for (int j = i + 1; j <= inputString.length(); j++) {
				System.out.println(inputString.substring(i, j));
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("Enter the input String");
		Scanner sc = new Scanner(System.in);
		String inputString = sc.next();
		
		printAllSubstrings(inputString);
	}

}
