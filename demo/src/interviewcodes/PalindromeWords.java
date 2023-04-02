package interviewcodes;

import java.util.ArrayList;
import java.util.List;

public class PalindromeWords {
	
	public void wordFinder() {
		
		String s ="mom is always wow racecar madam";
		String[] split = s.split(" ");
		String Word;
		String rev = "";
		System.out.println(split.length);
		List<String> Palindromic = new ArrayList<>();
		
		
		for(int i=0;i<split.length-1;i++) {
			for(int j=0;j<split[i].length()-1;j++) {
				if(split[i].charAt(0)==split[i].charAt(split[i].length()-1))
			
					
					Palindromic.add(split[i]);
					break;
				}
			}
			 
		System.out.println("palindromic words are :"  +Palindromic);
			
		}
	
		
	
	
	
	public static void main(String[] args) {
		PalindromeWords p = new PalindromeWords();
		p.wordFinder();
	}

}
