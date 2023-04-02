package wrappenclass;

public class OtherClass extends NonPrimitiveTypes {
	@Override
	public void intMethod() {
		System.out.println("overridden");
		
	}
	
	public static void main(String[] args) {
		OtherClass Obj = new OtherClass();
		Obj.intMethod();
		NonPrimitiveTypes n = new NonPrimitiveTypes();
		n.intMethod();
	}
 
}
