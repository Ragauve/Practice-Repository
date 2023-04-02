package interviewcodes;

public class Singleton {
	
	private static Singleton c = null;
	public String s= "single ton class";
	private Singleton() {
		System.out.println("inside singleton");
	}
	public static Singleton instanceSingleton() {
		if(c==null) {
			c= new Singleton();
		}
		return c;
	}
	
	
public static void main(String[] args) {
	
	Singleton a= Singleton.instanceSingleton();
	Singleton b = Singleton.instanceSingleton();
	
	System.out.println(a.hashCode());
	System.out.println(b.hashCode());
}
}
