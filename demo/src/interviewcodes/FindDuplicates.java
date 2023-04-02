package interviewcodes;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicates {
	
	public static void main(String[] args) {
		int size=0;
		int i=0;
		Set<Integer> noduplicates= new LinkedHashSet<>();
		
		System.out.println("enter array size");
		Scanner s = new Scanner(System.in);
		size=s.nextInt();
		
		int[]arr=new int[size];
		
		
		System.out.println("enter array values");
		while(i<size) {
			arr[i]=s.nextInt();
			i++;
		}
		
		System.out.println("finding duplicate values in an array");
		
		for(int j=0;j<size;j++) {
			
				noduplicates.add(arr[j]);
			}
		
		System.out.println("without duplicates");
		System.out.println(noduplicates);
			
		
	}

}
