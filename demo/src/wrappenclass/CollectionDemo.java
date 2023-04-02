package wrappenclass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class CollectionDemo {
	public static void main(String[] args) {
		
		LinkedList<String> li = new LinkedList<>();
		li.add("Ragauv");
		li.add("kumar");
		li.add("gopi");
		li.add("sure");
		
		System.out.println(li.get(2).hashCode());
		System.out.println(li.get(3).hashCode());
		
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Ragauv1");
		al.add("kumar1");
		al.add("gopi1");
		al.add("sure1");
		al.add(null);
		
		System.out.println(al.get(2).hashCode());
		System.out.println(al.get(3).hashCode());
	
		Set<String> sl= new HashSet<>();
		sl.add(null);
		sl.add("Ragav");
		sl.add("siva");
		
		System.out.println(sl.hashCode());
	
	}

}
