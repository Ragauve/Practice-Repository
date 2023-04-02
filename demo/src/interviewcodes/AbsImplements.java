package interviewcodes;

public class AbsImplements extends AbstracClass {

	@Override
	public void AbsMethod() {
		System.out.println("overrididden in subclass");
		
	}
	public static void main(String[] args) {
		
		AbstracClass c = new AbstracClass() {

			@Override
			public void AbsMethod() {
				System.out.println("Overridden in Object");
				
			}
			
		};
		c.AbsMethod();
		AbstracClass c1 = new AbsImplements();
		c1.AbsMethod();
		
		
	}

}
