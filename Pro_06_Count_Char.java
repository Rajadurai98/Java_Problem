package revolite.Preparation;

public class Pro_06_Count_Char {
	public static void main(String[] args) {
		String string="Hi myname is Rajadurai";
		
		int count =0;
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)!=' ') {
                count++;				
			}
		}
		System.out.println(count);
	}

}
