package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
public static void main(String[] args) {
	
	Set<String> s = new HashSet<>();
	s.add("Ragauv");
	s.add("siva");
	s.add("kumar");
	s.add("gopi");
	s.add("gopi");
System.out.println(s);
	List<String> s1 = new ArrayList<>(s);
	
	s1.add("kumar");
	s1.add("Ragauv");
	System.out.println(s1);
	for(int i=0;i<s1.size();i++) {
		
		for( int j= i+1; j<s1.size();j++) {
			if(s1.get(i)==s1.get(j)) {
				s1.remove(j);
				j--;
			}
	}
	}
	System.out.println(s1);
	
}
}