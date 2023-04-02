package first;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapCollection {
public static void main(String[] args) {
	Map <Integer, String>mi =new HashMap();
	mi.put(1, "prasana");
	mi.put(2, "Arun");
	Set<Entry<Integer, String>> entrySet = mi.entrySet();
	for (Entry<Integer, String> entry : entrySet) {
		System.out.println(entry);
	}
}
}
