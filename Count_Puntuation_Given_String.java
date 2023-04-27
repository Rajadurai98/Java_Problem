package program.org;

public class Count_Puntuation_Given_String {
	public static void main(String[] args) {
		
	int count=0;
	String str="Good Morning! Mr. James Potter. Had your breakfast?";
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='!'||str.charAt(i)=='.'||str.charAt(i)=='?') {
			count++;
		}
	}
	System.out.println("Total number of punctuation characters exists in string: "+count);

}
}