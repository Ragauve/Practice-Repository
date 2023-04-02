package first;

import org.omg.CORBA.StringHolder;

public class StringMethods {
String str =new String("welcome to java");
	
	String str1 ="java";
	
	
	public void stringMatches() {
		
		boolean matches = str.matches("java");
		System.out.println(matches);
		
	int len=str.length();
	int avg = len/2;
	System.out.println(avg);
	
		int compareTo = str.compareTo(str1);
		
		System.out.println(compareTo);
		boolean co = str.contentEquals(str1);
		System.out.println(co);
	}
	public static void main(String[] args) {
		StringMethods s = new StringMethods();
		s.stringMatches();
	}
	
	

}

