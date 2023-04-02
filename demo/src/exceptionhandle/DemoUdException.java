package exceptionhandle;

public class DemoUdException {
	public static void code() {
		
		try {
			
			throw new UserDefindedException("User given exception");
				}
		catch(UserDefindedException s) {
			System.out.println("handled user defined exception");
		}
		
	}

	public static void main(String[] args) {
		code();
	}
}
