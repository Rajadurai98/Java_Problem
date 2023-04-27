package program.org;

public class Find_Frequency_Char {
	public static void main(String[] args) {
		String str = "Rajadurai";
		char ch = 'a';
		int frequency = 0;
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				frequency++;
			}
		}
		System.out.println("Frequency of characters " + frequency);
	}

}
