package interview.Questions;

public class Print_Quotient_Remainder {
	public static void main(String[] args) {
		int divident=25;
		int divisor	=5;
		int quotient=0;
	             	
		while(divident>=divisor) {//25>=5 t,20>=5t,15>=5,10>=5,5>=5
			divident=divident-divisor;//divident=20,15,10,5,0
			quotient++;//1,2,3,4,5
		}
		System.out.println("Quotient is "+ quotient );
		System.out.println("Remainder is "+divident);
	}

}
