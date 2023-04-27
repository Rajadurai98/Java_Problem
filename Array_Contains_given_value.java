package array.java;

public class Array_Contains_given_value {
	public static void main(String[] args) {
		int num[]= {1,2,3,4,5};
		int toFind=3;
		boolean found=false;
		
		for(int i=1;i<num.length;i++) {
			if(num[i]==toFind) {
				
				found =true;
				break;
			}
		}
		if(found) {
			System.out.println(toFind+" is found");
		}
		else {
			System.out.println(toFind+" is not found");
		}
	}

}
