package interviewcodes;

import java.util.ArrayList;
import java.util.Collections;

public class SecondLargest implements Comparable<SecondLargest> {
	
public int a;
	
	

	public int getA() {
	return a;
}
public void setA(int a) {
	this.a = a;
}
	public SecondLargest(int a) {
	super();
	this.a = a;
}
	
	
	@Override
	public int compareTo(SecondLargest o) {
		if(this.a==o.a)
			return 0;
		else if(this.a > o.a)
			return -1;
		else
		
		return 1;
	}
public static void main(String[] args) {
	
	
	
	ArrayList<SecondLargest> li = new ArrayList<>();
	li.add(new SecondLargest(10));
	li.add(new SecondLargest(20));
	li.add(new SecondLargest(30));
	li.add(new SecondLargest(40));
	
	Collections.sort(li);
	for(int i=0; i< li.size();i++) {
		if(i==1) {
			System.out.println("second largest no" +li.get(i).getA());
		}
	}
	
	
	
}
}
