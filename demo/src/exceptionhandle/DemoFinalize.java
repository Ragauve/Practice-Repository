package exceptionhandle;

public class DemoFinalize extends Object {
	
	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("Finalize methode calling");
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	public void add() {
		int a=10; 
		int b=10, c;
		c= a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) throws Throwable {
		DemoFinalize d = new DemoFinalize();
		System.out.println(d.hashCode());
		d.add();
		System.out.println(d);
		System.out.println(d.hashCode());
		d.finalize();
		System.out.println(d.toString());
		System.out.println(d.hashCode());
		
	}

}
