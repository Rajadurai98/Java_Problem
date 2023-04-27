package program.org;

public class Counts_Number_Words {
	public static void main(String[] args) {
		String str="Raja durai";
		int count=1;
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)==' '&&(str.charAt(i+1)!=' ')) {
				count++;
			}
		}
		System.out.println("Number of words in a String "+count);
	}

}
