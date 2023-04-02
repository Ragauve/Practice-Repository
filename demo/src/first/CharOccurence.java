package first;

public class CharOccurence {
	public static void main(String[] args) {
		
		String s="Ragauv is a fool";
		int a =0;
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='a') {
				a=a+1;
				
			}
		}
		System.out.println("occurence count of A is:" +a);
	}
	

}
