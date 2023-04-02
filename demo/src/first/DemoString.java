package first;

public class DemoString {
	public static void main(String[] args)
	{
		char [] ch = {'r','a','g','a','u','v'};
		String s = new String(ch);
		int a= ch.length;
		System.out.println("length of string "+a);
		char ss = s.charAt(5);
		System.out.println("character at given index " +ss);
		
	String s1 ="";
	String s2="Ragav";
	System.out.println(s1.compareTo(s2));
	System.out.println(s2.compareTo(s1));
	
	System.out.println("concatenated string is "+s1.concat(s2));
	boolean contains = s1.contains("av");
	System.out.println(contains);
	boolean endsWith = s2.endsWith(" ");
	System.out.println("the given statement ends with" + endsWith);
		StringBuffer sss= new StringBuffer("welcome to string");
	System.out.println(sss);
	
	System.out.println(sss);
	sss.insert(17, "guna");
	System.out.println(sss);
	int indexOf = sss.indexOf("string");
	System.out.println(indexOf);
	StringBuffer insert = sss.insert(5,false);
	
	
	}

}

