package first;

public class StringRevDemo {
public static void main(String[] args) {
	String s="Ragav";
	String s1="";
	
	String s2="Ragav";
	char ch;
	
	for(int i=s.length()-1;i>=0;i--)
	{
		ch=s.charAt(i);
		s1=s1+ch;
			}
	System.out.println(s1);
	
	s=s.concat("siva");
	System.out.println(s);
	
	System.out.println(s.hashCode());
	System.out.println(s2.hashCode());
	
	StringBuffer ss= new StringBuffer("Ragav");
	StringBuffer ss1= new StringBuffer("siva");
	ss.append("siva");
	System.out.println(ss);
	
	System.out.println(ss.hashCode());
	System.out.println(ss1.hashCode());
	
}
}
