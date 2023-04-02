package UserDefinedList;

public class Runner extends Java8Abstract {
	
	public static void main(String[] args) {
		
		Java8Abstract s= new Runner() ;
		s.display();
			
		
	}

	@Override
	public void display() {
		System.out.println("override abstract method of non abstract method");
		
	}

}
