package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Comparison implements Comparable<Comparison> {
	
	public int id;
	public String name;
	public int age;
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
	public Comparison(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Comparison o) {
		if(this.age==o.age) {
		return 0;}
	else if(this.age>o.age) { 
		return 1;}
	else {}
		return -1;
		
	}
	
	public static void main(String[] args) {
		
		Comparison c= new Comparison(10, "Ragav",30);
		Comparison c1= new Comparison(20, "kumar",25);
		Comparison c2= new Comparison(30, "gopi",31);
		Comparison c3= new Comparison(50, "raja",35);
		
		ArrayList<Comparison> l= new ArrayList<>();
		l.add(c);
		l.add(c1);
		l.add(c2);
		l.add(c3);
		
		Collections.sort(l);
		
		for (Comparison value : l) {
			
			System.out.println(value.getAge());
			
		}
		
	}
	
	
	

}
