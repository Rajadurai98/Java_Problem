package array.java;

public class DuplicateElement {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,1,2,3,5};
		
		System.out.println("Duplicate elements in an given ARRAY");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}

}
