package interviewcodes;

public class Primenumber {
	
	public static void main(String[] args) {
		 int num=7;
		for(int i=1;i<=num;i++) {
		 if(num%1==0 && num/i==1) {
			 
			 System.out.println("prime no" +num);
		 }
		 else if(num==i && num/i==1)
		 {
			 System.out.println("not a prime no");
		 }
	}
	}
}




