package program.org;

public class Largest_Three_Number {
	public static void main(String[] args) {
		int n1=35,n2=20,n3=30;
		
		if(n1>=n2&&n1>=n3) {
			System.out.println(n1+" Is the largest number");
		}
		else if(n2>=n3&&n2>=n1) {
			System.out.println(n2+" is the largest number");
		}
		else {
			System.out.println(n3 +" is the largest number");
		}
		
	}

}
