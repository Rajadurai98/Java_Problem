package basicjava.com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Map_Collection_Ex1 {
	public static void main(String[] args) {
		Map<Integer,String> map= new HashMap<Integer,String>();
		map.put(1, "aaa");
		map.put(1, "aaa");
		map.put(2, "bbb");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		//2nd way
		Iterator<Map.Entry<Integer, String>> itr=map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, String> entry=itr.next();
			System.out.println(entry.getKey() + entry.getValue());
		}
		
	}

}
