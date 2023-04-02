package functionalInterfaces;

import java.util.function.Function;

public class UsingFunction {

	
	public void usingLamda() {
		
	Function<Integer,Integer> f = num->{
		num = num +1;
		return num+num;};
	
	System.out.println(f.apply(10));
		
	}
	
	public void usingAnonymous() {
		
		Function<Integer,Integer> f= new Function<Integer,Integer>() {

			public Integer apply(Integer num) {
				// TODO Auto-generated method stub
				return num+num;
			}};
		System.out.println(f.apply(20));
		
	
		
		
		
	}

	public static void main(String[] args) {
		UsingFunction fun = new UsingFunction();
		fun.usingLamda();
		fun.usingAnonymous();
	}
}
