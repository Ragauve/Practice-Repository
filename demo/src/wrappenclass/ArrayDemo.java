package wrappenclass;

public class ArrayDemo {
	
	public  void Demo() {
		
		int[] a= new int[6];
		a[0]=10;
		a[1]=11;
		a[2]=5;
		a[3]=7;
		a[4]=11;
		a[5]=10;
		
		
		
		int[][] c = new int[2][2];
		c[0][0]=1;
		c[0][1]=2;
		
		String[] z= new String[2];
		z[0]="Ragauv";
		z[1]=null;
		
		System.out.println(c.hashCode());
		int[][]d = c.clone();
		
		System.out.println(d.hashCode());
		
		System.out.println(a.hashCode());
		
		System.out.println("using for each");
		
//		for (int i : a) {
//			System.out.println(i);
//			
//		}
		
		System.out.println("using for loop");
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//			
//			
//		}
		System.out.println("before cloning");
		
		int[] b= a.clone();
		
		System.out.println("after cloning");
//		for(int i=0;i<b.length-1;i++) {
//			System.out.println(b[i]);
//			
//		}
		System.out.println(b.hashCode());
		

	}
	public static void main(String[] args) throws Throwable {
		ArrayDemo d = new ArrayDemo();
		d.Demo();
		d.finalize();
		System.out.println(d.hashCode());
		
	}

}
