package revolite.Preparation;

public class Pro_07_Triangle_Pattern_Binary {
	public static void main(String[] args) {
		int rows=9;
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2==0) {
					System.out.print("0");
				}
				else {
					System.out.print("1");
				}
			}
			System.out.println();
		}
	}

}
