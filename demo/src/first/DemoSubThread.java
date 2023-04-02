package first;

public class DemoSubThread extends Thread{
	DemoThread t = new DemoThread();
	public DemoSubThread(DemoThread s) {
		t=s;
	}
	public void run(){
		
		try {
			t.multiply(6);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
	

}

