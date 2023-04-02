package wrappenclass;

public class ConstructorChaining extends Constructor {
	
	public ConstructorChaining(String s) {
		this();
		System.out.println(s);
		
		
	}
	
	public ConstructorChaining() {
		this(5);
		System.out.println("no args constructo");
		
	}
	
	ConstructorChaining(int a){
	
		super();
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		ConstructorChaining c= new ConstructorChaining("Ragav");
		
	}
}
