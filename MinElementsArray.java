package interview.Questions;

public class MinElementsArray {
	public static void main(String[] args) {
		int a[]= {46,5,9,45,8,445,8};
		int min=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);
	}

}
