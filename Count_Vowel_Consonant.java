package program.org;

public class Count_Vowel_Consonant {
	public static void main(String[] args) {
		int Vcount = 0, Count = 0;
		String str = "This is a really simple sentence";
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				Vcount++;
			}

			else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				// Increments the consonant counter
				Count++;
			}
		}
		System.out.println(Vcount);
		System.out.println(Count);

	}
}
