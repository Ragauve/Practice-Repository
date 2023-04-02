package interviewcodes;

public class Codes {
	
public static void main(String[] args) {
	int f1=0;
	int f2=1;
	int limit=6
			;
	int temp;
	for(int i=0;i<limit;i++) {
		
		temp=f1+f2;
		f1=f2;
		f2=temp;
		System.out.println(temp);
		
	}
}


}
