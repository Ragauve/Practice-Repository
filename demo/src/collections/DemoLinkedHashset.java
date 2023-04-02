package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DemoLinkedHashset {
	
	public static void main(String[] args) {
	Set<String> s1 = new TreeSet<>();
	s1.add("Akash");
	s1.add("Bhuvi");
	s1.add("Ragav");
	s1.add("Bala");
	s1.add("BALA");
	
	System.out.println(s1);
	List<String> l = new ArrayList<>(s1);
	for(int i=0;i<l.size();i++)
	{
	for(int j=i+1;j<l.size(); j++) {
		if(l.get(i).equalsIgnoreCase(l.get(j))) {
			System.out.println(l.get(j));
		}
	}
		
	
		

	}
	}
	

}
