package first;

public class SubThread2 extends Thread {
	DemoThread t1;
	public SubThread2(DemoThread s1) {
		t1=s1;
		
	}
	public void run(){
		
		try {
			t1.multiply(10);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
}
