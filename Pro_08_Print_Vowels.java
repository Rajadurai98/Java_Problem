package revolite.Preparation;

public class Pro_08_Print_Vowels {
	public static void main(String[] args) {
		String s = "hi myname is rajadurai";
		s = s.toLowerCase();
		int count = 0;
		int vCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				count++;
			} else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				vCount++;
			}
		}
		System.out.println(count);
		System.out.println(vCount);
	}

}
