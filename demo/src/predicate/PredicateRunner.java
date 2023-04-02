package predicate;

import java.util.*;
import java.util.function.Predicate;

public class PredicateRunner {
	
	public static void main(String[] args) {
		
		PredicateExample p = null ;
		List<PredicateExample> l = new ArrayList<>();
		
		l.add(new PredicateExample("Ragu",35,10000.00));
		l.add(new PredicateExample("siva",40,15000.00));
		l.add(new PredicateExample("Ben",38,25000.00));
		
		Predicate<PredicateExample> gtAge=Integer->Integer.getAge()>35;
		
		Predicate<PredicateExample> gtSal= List->List.getSalary()>10000.00;
		
		for (PredicateExample example : l) {
			if(gtSal.test(example)) {
				System.out.println(example.getEmployeeName());
			}
			if(gtAge.test(example)) {
				System.out.println(example.getEmployeeName());
			}
		}
	}

}
