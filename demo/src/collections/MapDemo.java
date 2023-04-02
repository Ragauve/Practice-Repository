package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, String> mm = new HashMap<>();
		mm.put(1, "Ragauv");
		mm.put(2, "kumar");
		mm.put(3, "gopi");
		Set<Entry<Integer, String>> l = mm.entrySet();
		for (Entry<Integer, String> entry : l) {
			
			System.out.println(entry.getValue() +entry.getKey());
			
		}
	}

}
