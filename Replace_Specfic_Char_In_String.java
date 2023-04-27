package program.org;

public class Replace_Specfic_Char_In_String {
	public static void main(String[] args) {
		String str = "Once in a moon";
		char ch = '-';
		str = str.replace(' ', ch);
		System.out.println("String after replacing spaces with given character: ");
		System.out.println(str);
	}

}
