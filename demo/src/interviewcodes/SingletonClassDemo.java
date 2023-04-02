package interviewcodes;

public class SingletonClassDemo {
	
	static SingletonClassDemo s;
	
	private SingletonClassDemo() {
		
		
			System.out.println("Inside singleton constructor");
		
	}

	public  static SingletonClassDemo methodObj() {
		if(s==null) {
			s= new SingletonClassDemo();
		}
		return s;
	}
	
	public static void main(String[] args) {
		
		SingletonClassDemo a = SingletonClassDemo.methodObj();
		SingletonClassDemo b = SingletonClassDemo.methodObj();
		SingletonClassDemo c= SingletonClassDemo.methodObj();
	}
}
