package wrappenclass;

public class StringDemo {
	
	
	

	public static void main(String[] args) {
	
		String s ="Ragauv";
		String s1="Ragauv";
		String s4= new String("Ragauv");
		System.out.println(s4.hashCode());
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
		String s2 =new String("3.125");
		StringBuffer s3 =new StringBuffer("Ragauv");
		System.out.println(s3.hashCode());
		
		System.out.println(s.contains("uv"));
		
		
		String join = s1.join(s, "aa");
		
		System.out.println(join);
		
		String s5 ="ragauv";
		System.out.println( s.equalsIgnoreCase(s5));
	s3.append("kumar");
	System.out.println(s3);
	s3.insert(11, "siva");
	System.out.println(s3);
	s3.reverse();
	System.out.println(s3);
	System.out.println(s3.capacity());
		
	}

}
