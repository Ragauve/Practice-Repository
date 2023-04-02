package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.annotation.XmlElementDecl.GLOBAL;

public class DemoList {
	public static void main(String[] args) {
		
	
	List<String>  l = new ArrayList<>();
	l.add("ragav");
	l.add("gokul");
	l.add("hhhj");
	l.add("hello");
	
	for(int j=0;j<l.size();j++)
	{
	System.out.println(l.get(j).hashCode());
	}
	System.out.println(l.contains("hello"));
	System.out.println(l.size());
	l.remove("hhhj");
	l.remove(0);
	Collections.sort(l);
	
	List<String> l1 = new LinkedList<>();
	l1.add("kumar");
	l1.add("gopi");
	l1.add("sankar");
	l1.add("prem");
	System.out.println(l1);
	System.out.println(l1.hashCode());
	for (String string : l) 
		
	{
		System.out.println(string);
	
	
	}
}
	}
