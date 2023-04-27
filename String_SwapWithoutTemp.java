package program.org;

public class String_SwapWithoutTemp {
	public static void main(String[] args) {
		String a = "Love";  
        String b = "You";  
        System.out.println("Before swap: " + a + " " + b); 
        a=a+b;//LoveYou
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println("After : " + a + " " + b);
        
	}

}
