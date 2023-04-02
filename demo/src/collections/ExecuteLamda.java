package collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ExecuteLamda implements DemoLamda  {
	@Override
	public void lamdaDemo() {
		
		
	}
	

	public static void main(String[] args) {
		
		DemoLamda d1 =()->{
			System.out.println("excuting using lamda");
		};
		d1.lamdaDemo();
	}
	


	}
