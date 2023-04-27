package program.org;

public class Find_Duplicate_Char_String {
	public static void main(String[] args) {
		String str="w3schools";
		int cnt = 0;
		  char[] str1=str.toCharArray();
		  for(int i=0;i<str.length();i++) {
			  for(int j=i+1;j<str.length();j++) {
				  if(str1[i]==str1[j]) {//w==3 f,w==s f,w==c f,w==h f,w==o f,w==o f,w==l f,w==s f
					                    //3==s f,,,,,,,,,
					                    //s==c f,s==h f,s==o f,s==o f,s==l f,s==s t
					  System.out.println(str1[j]);
					  cnt++;
				  }
			  }
		  }
		  System.out.println(cnt);
		 }
		}