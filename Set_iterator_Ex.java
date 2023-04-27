package basicjava.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_iterator_Ex {
	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		set.add("aaa");
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		Iterator<String> iterator= set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	
	}
}
