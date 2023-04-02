package first;

public class DemoThread {
	
	   void multiply(int n) throws Throwable {
		 
		 for(int i=0;i<n;i++) {
			 System.out.println(i*n);
			 Thread.sleep(2000);
		 }
		 
		 

	}

}
