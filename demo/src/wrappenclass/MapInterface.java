package wrappenclass;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface {
	public static void main(String[] args) {
		Map<Integer,String> m = new HashMap<>();
		m.put(1, "Ragav");
		m.put(2, "siva");
		m.put(3, "kumar");
		
		System.out.println(m);
		
		Set<Entry<Integer,String>> entrySet = m.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			
		System.out.println(entry.getKey()+" "+entry.getValue());
		}
	
		
	}

}
