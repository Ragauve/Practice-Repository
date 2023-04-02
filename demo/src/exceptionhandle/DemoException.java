package exceptionhandle;



public class DemoException extends Exception {
	
	public void getString( String s) {
		
		if(s.isEmpty()==true                                                                                                                                                                                                            )
		{
			throw new IndexOutOfBoundsException("no string exception");
		}
		else {
			System.out.println(s);
		}
	}
public static void main(String[] args) {
	DemoException d = new DemoException();
	d.getString(null);
}
}
