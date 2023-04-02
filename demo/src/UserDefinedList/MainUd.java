package UserDefinedList;

import java.util.ArrayList;
import java.util.List;

public class MainUd extends UserDefinition {
	public static void main(String[] args) {
		
		MainUd m= new MainUd();
		m.setId(100);
		m.setName("Ragav");
		m.setCourse("java");
		m.setAddress("chennai");
		MainUd m1= new MainUd();
		m1.setId(101);
		m1.setName("sivsa");
		m1.setCourse("selenium");
		m1.setAddress("chennai");
		List<UserDefinition> l = new ArrayList<UserDefinition>();
		l.add(m);
		l.add(m1);
		System.out.println(l);
		
		for (UserDefinition uD : l) {
			System.out.println(uD.getId());
			System.out.println(uD.getName());
			System.out.println(uD.getCourse());
			System.out.println(uD.getAddress());
		
			
		}
		
	}
}
