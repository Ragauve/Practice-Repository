package first;

public class MainThread  {
public static void main(String[] args) throws Throwable {
	DemoThread s = new DemoThread();
	
	DemoSubThread t1 = new DemoSubThread(s);
	SubThread2 t2 = new SubThread2(s);
	t1.start();
	t2.start();
}


}
