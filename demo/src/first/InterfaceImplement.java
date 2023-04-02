package first;

public class InterfaceImplement implements AbstractClass {

	@Override
	public void method1() {
		System.out.println("method1");
		
	}

	@Override
	public void method2() {
		
		System.out.println("method2");
	}

	@Override
	public void method3() {
		System.out.println("method3");
		
	}

	public static void main(String[] args) {
		InterfaceImplement obj =new InterfaceImplement();
		obj.method1();
		obj.method2();
		obj.method3();
		
		
	}
}
