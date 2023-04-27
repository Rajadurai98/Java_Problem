package program.org;

public class Smallest_Three_number {
	public static void main(String[] args) {
		int n1=30,n2=40,n3=50;
		if(n1<=n2&&n1<=n3) {
			System.out.println(n1+" is the Smallest number" );
		}
		else if(n2<=n3&&n2<=n1) {
			System.out.println(n2+" is the smallest number");
		}
		else {
			System.out.println(n3+" is the smallest number");
		}
	}

}
