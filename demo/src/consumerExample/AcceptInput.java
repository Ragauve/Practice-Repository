package consumerExample;

import java.util.*;
import java.util.function.Consumer;
public class AcceptInput {
	
	public void usingAnonymous() {
		Consumer c= new Consumer() {

			@Override
			public void accept(Object input) {
				
				System.out.println(input.toString());
			}
			
		};
		c.accept("HEllo world");
	}
	
	
	public void usingLamda() {
		
		Consumer<String> passin=input-> System.out.println(input);
		Consumer<String>passed=input->System.out.println(input);
		
		passin.andThen(passed).accept("hello All");
		
		
		
	}
	public static void main(String[] args) {
		
		int a[] = {10,20,30,40};
		
		List<Integer> li = Arrays.asList();
		
	AcceptInput a1 = new AcceptInput();
	a1.usingAnonymous();
	a1.usingLamda();
	
	
	}
	
}
