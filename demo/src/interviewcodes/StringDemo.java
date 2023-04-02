package interviewcodes;

public class StringDemo {

	public static void main(String[] args) {
		
		String str = new String("Welcome to JavaTpoint").intern();   
		String str1 = new String("Welcome to JavaTpoint").intern();
		String str2 ="Welcome to JavaTpoint";
		String str3="Welcome to JavaTpoint";
		
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(str == str1);
		System.out.println(str.equals(str1));
		System.out.println(str1.equals(str2));
	}
}
