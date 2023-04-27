package program.org;

public class Swapping_Without_Third_Variable {
	public static void main(String[] args) {
		int x = 5;
		int y = 10;

		System.out.println("Before Swapping " + x + " " + y);

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("After Swapping " + x + " " + y);
	}

}
