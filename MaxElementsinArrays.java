package interview.Questions;

public class MaxElementsinArrays {
	public static void main(String[] args) {
		int a[] = { 45, 85, 9, 8, 6, 9 };

		int max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Maximum value of array is " + max);
	}

}
