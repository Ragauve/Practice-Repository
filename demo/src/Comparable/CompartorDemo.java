package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompartorDemo {
	
	private int id;
	private String name;
	private int age;
	public CompartorDemo(int id, String name, int age) {
		
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	 
	
	public static void main(String[] args) {
		
		

			
		
		ArrayList<CompartorDemo> arr = new ArrayList<>();
		
		arr.add(new CompartorDemo(10,"Ragav",30) );
		arr.add(new CompartorDemo(20,"siva",25));
		arr.add(new CompartorDemo(30,"kumar",31));
		arr.add(new CompartorDemo(40,"gopi",45));
		
		
		Comparator<CompartorDemo> c = new Comparator<CompartorDemo>() {

			@Override
			public int compare(CompartorDemo o1, CompartorDemo o2) {
				
				if(o1.getAge()>o2.getAge())
				return 1;
				else if(o1.getAge()==o2.getAge())
					return 0;
				else
					return -1;
			}
			
		};
		
		Collections.sort(arr, c);
		
		for (CompartorDemo cc : arr) {
			
			System.out.println(cc.getId()  +cc.getName()  +cc.getAge());
			
		}
		
	}
	
	}

