package exceptionhandle;

public class Nestedtry {
	
public void exceptionHandler() {
	try {
		System.out.println("divide by zero is happening " );
		int a= 50/0;
		a=a*0;
		
		
	}
		
	catch (ArithmeticException e) {
		System.out.println("Divide by zero exception" +e);
	}
	
	try {
		System.out.println("index out of bounds is happening");
		 int b[] = new int[5];
	b[5]=10;
	
	
} 	
	catch (Exception e) {
			System.out.println("index out of bounds " +e);
		}


	finally {
		System.out.println("handled exceptions");
	}
}
public static void main(String[] args) {
	Nestedtry n = new Nestedtry();
	n.exceptionHandler();
	
}
}


