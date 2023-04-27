package interview.Questions;

public class Counts_Of_Digits {
	public static void main(String[] args) {
		int count =0,num=1234567890;
		while(num!=0) {
			num=num/10;
		
			count++;
		}
		System.out.println(count);
	}

}
