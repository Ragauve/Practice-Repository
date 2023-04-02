package first;

public class Regexdemo {
	
	// removing special characters from a strings
	public static void main(String[] args) {
		String s="###** Ragauv is a fool###";
		
		s= s.replaceAll("[^a-zA-Z]", "");
		System.out.println(s);
	}

}
