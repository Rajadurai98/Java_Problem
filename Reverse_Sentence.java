package program.org;

public class Reverse_Sentence {
	public static void main(String[] args) {
		String str = "I Love Programming";

		String rev = "";

		String str1[] = str.split(" ");
		for (int i = 0; i < str1.length; i++) {
			rev = str1[i] + " " + rev;//=I,Love I,Programming Love i
		}

		System.out.println(rev);
	}

}
