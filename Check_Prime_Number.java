package final_interview;

public class Check_Prime_Number {
	public static void main(String[] args) {
		int num=29;
		boolean flag=false;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {//t,f,f,f,f,t,f,f,f,f,f,f,t
				flag=true;
				break;
			}
		}
		if(!flag) {
			
			System.out.println(num+" its a prime number");
		}
		else {
			System.out.println(num+" its not a prime number");
		}
	}

}
