package test;

import java.util.Arrays;

//palindromes are the ones when they are reversed it forms a same word
// e.g mom


public class Palindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sent = "momf";
		//reverse this string char and store it in a string
		String rev = "";
		int count = 0;
		String[] store = new String[sent.length()];
		for(int i=sent.length()-1; i>=0; i--) {
			rev = rev+sent.charAt(i);//+ refers to concatination
			System.out.println(rev);
			store[count] = rev;
			System.out.println("ARRAY: "+store[count]);
			count++;
		}
		boolean check = true;
		//find plindromes
		for(int i=0; i<sent.length(); i++) {
			if(sent.charAt(i) != rev.charAt(i)) {
				check = false;
			}
		}
		if(check) {
			System.out.println("Palindromes");
		}
		else {
			System.out.println("Not Palindromes");

		}
		
	}

}
