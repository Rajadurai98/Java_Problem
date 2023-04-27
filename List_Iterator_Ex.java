package basicjava.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_Iterator_Ex {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(21);
		list.add(21);
		Iterator<Integer> iterator=	list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
