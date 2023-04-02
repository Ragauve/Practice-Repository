package wrappenclass;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class NonPrimitiveTypes extends AbsClass {
	
	public void intMethod() {
		Integer i = 10;
		int a =i;
		System.out.println(i+ "" +a);
	}

	@Override
	public void AbsMethod() {
		System.out.println("abstract Method");
		
		
	}
	public static void main(String[] args) throws Throwable {
		NonPrimitiveTypes nobj = new NonPrimitiveTypes();
		nobj.nonAbsMethod();
		FinalDemo f = new FinalDemo();
		
		PrintStream p = new PrintStream("system");
		p.println("pp");
		
		
		
	}
	
	
}

