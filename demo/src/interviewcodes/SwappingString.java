package interviewcodes;

public class SwappingString {
	public static void main(String[] args) {
		
		String s="Ragav";
		String s1="endhiran";
		
		s=s+s1;
		
		s1=s.substring(0,5);
		s= s.substring(5, 13);

		
		System.out.println("String s is :"+s);
		System.out.println("String s1 :" +s1);
		
		
	}

}
