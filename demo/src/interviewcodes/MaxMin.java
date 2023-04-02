package interviewcodes;

import java.util.Scanner;

public class MaxMin {
	
	public static int max;
	public static int min;
	int size;
	int[]arr;
	public int[] getvalue() {
		int i=0;
		
		System.out.println("enter the size of array");
		
		Scanner s =new Scanner(System.in);
		
		size=s.nextInt();
		
		arr = new int[size];
		
		System.out.println("enter the values of array");
		while( i<size) {
			arr[i]=s.nextInt();
			
			i++;
			
			
		}
		
		System.out.println(arr);
		
		return arr;
	
		

	}
	
	public void minMax() {
		min=arr[0];
		max=arr[0];
		
		for(int i=0;i<size;i++) {
			if(arr[i]> max)
			{
				max=arr[i];
				
			}
			else if(arr[i]<min) {
				min=arr[i];
				
						}
		}

		System.out.println("max value is :"+max);
		System.out.println("min value is :" +min);
	}
	public static void main(String[] args) {
		MaxMin m = new MaxMin();
		m.getvalue();
		m.minMax();
	}

}
