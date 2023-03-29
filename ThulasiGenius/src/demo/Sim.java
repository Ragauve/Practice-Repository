package demo;

public class Sim {
	private void calls() {
		// TODO Auto-generated method stub
		
		System.out.println("need to call");

	}
	public static void main(String[] args) {
		Mobile s= new Mobile();
		// class name object name = new classname();
		s.access();
		Sim a=new Sim();
		a.calls();

	}
}