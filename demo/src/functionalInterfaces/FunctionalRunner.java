package functionalInterfaces;

public class FunctionalRunner  {
	
	 static FunctionalDemo f= (num)->{return num+num;};

	public static void main(String[] args) {
		FunctionalRunner f1 = new FunctionalRunner();
		
		System.out.println(f.Addition(10));
			}
}
