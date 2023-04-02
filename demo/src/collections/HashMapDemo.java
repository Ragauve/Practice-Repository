package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		 Map<Integer, String> m = new HashMap<Integer, String>();
		 m.put(10,"Ragav");
		 m.put(20, "Kumar");
		 m.put(30, "siva");
		 
		 Map<Integer,String> duplicate = new HashMap<>();
		 
		 duplicate.putAll(m);
		 
		 System.out.println(duplicate);
		 
		 Set<Integer> keySet = m.keySet();
		 
		 System.out.println(keySet);
		 
		 Collection<String> values = m.values();
		 System.out.println(values);
	}

}

