package interviewcodes;

public abstract class AbstracClass {
	
	public AbstracClass() {
		System.out.println("Constructor of Abstract method");
	}
	
	public abstract void AbsMethod();
	public void nonAbsMethod() {
		System.out.println("non abstract method in abstract class");

	}
	
	public static void main(String[] args) {
	
		AbstracClass a = new AbstracClass() {
			
			@Override
			public void AbsMethod() {
				System.out.println("Abstract method in abstract class");
				
			}
		};
	
	a.AbsMethod();
	}
	
	
	

}
