package basicjava.com;

class test {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class Encaps_Ex1 {
	public static void main(String[] args) {
		test e = new test();
		e.setName("Raja");
		System.out.println(e.getName());
	}
}