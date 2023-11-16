 package test;

import java.util.ArrayList;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findPrime(2, 100));
	}

	public static ArrayList<Integer> findPrime(int start, int end){
		ArrayList<Integer> primes = new ArrayList<>();
		boolean check = true;
		for(int i=start; i<end; i++) {
			
			for(int n=2; n<=i/2; n++) {
				if(i%n ==0) {
					check = false;
					break;
				}
				
			}
			if(check) {
				primes.add(i);

			}

		}
		
		
		return primes;
		
	}
}
