package interviewcodes;

import java.util.ArrayList;
import java.util.List;

public class PalindromeWord {

	public static void main(String[] args) {
		String[] s= {"madam","kayak","deified","kumar"};
		String rev ="";
		List<String> palindromes = new ArrayList<>();
		List<String> nonpalindromes = new ArrayList<>();
		int j;
		for(int i=0;i<s.length;i++) {
			for( j=s[i].length()-1;j>=0;j--) {
			
			char ch=s[i].charAt(j);
			rev = rev+ch;
			
			}
			
		
			
		if(rev.equals(s[i])) {
			palindromes.add(s[i]);
			
			rev="";
		}
		else
		{
			nonpalindromes.add(s[i]);
			
			rev="";
		}
	}
		System.out.println("palindromes are :" +palindromes);
		System.out.println("this words are non palindromes" +nonpalindromes);
}}
