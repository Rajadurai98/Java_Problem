package program.org;

public class Remove_Vowels {
	public static void main(String[] args) {
		String str="Rajadurai";
		String str1="";
		str1=str.replaceAll("[aeiou]", "");
		System.out.println("String after removing vowels "+str1);
	}

}
