package program.org;

public class Print_Duplicate_Character_String {
	public static void main(String[] args) {
		String str = "beautifull beach";

		char[] chararray = str.toCharArray();
		System.out.println("The String is" + str);
		System.out.println("Duplicate Characters in above String ");
		for (int i = 0; i <= str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (chararray[i] == chararray[j]) {
					System.out.print(chararray[i] + " ");
					break;
				}

			}
		}

	}

}
