package interview.Questions;

public class Sum_Of_Digits {
	public static void main(String[] args) {
		int num=1234567890,rem,sum=0,ld;
		while(num!=0) {
			rem=num%10;
			sum=sum+rem;
			ld=num/10;
		}
		System.out.println(sum);
	}

}
