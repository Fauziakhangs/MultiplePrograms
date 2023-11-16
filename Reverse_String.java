package test;
//take a string and then reverse its letters

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		do {
			System.out.println("Enter string: ");
		Scanner sc = new Scanner(System.in);
		String r = sc.nextLine();
		
		System.out.println("\n"+reverse(r));
		System.out.println("To Quit  press 0 else 1:");
		n = sc.nextInt();
		}while (n!=1);
		
	}
	public static String reverse(String s) {
		char[] rev = new char[s.length()];
		
		for(int i=0; i<s.length(); i++) {
			System.out.print(s.charAt(i));
		}
		int count = 0;
		String reverse = "";
		for(int i=s.length()-1; i>=0; i--) {
			//System.out.print("\n"+s.charAt(i));
			rev[count] = s.charAt(i);
			count++;
		}
		for(int i=0; i<s.length();i++) {
			reverse = reverse + rev[i];
		}
		
		return reverse;
	}

}
