package test;

import java.util.Scanner;

public class ReactionTimer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("1");
		Thread.sleep(1000);
		System.out.println("2");
		Thread.sleep(1000);
		System.out.println("3");
		Thread.sleep(1000);
		System.out.println("Go!!!!!!!!!!!");
		
		long startTime = System.currentTimeMillis();
		Scanner sc= new Scanner(System.in);
		sc.next();
		long stopTime = System.currentTimeMillis();
		
		long r = stopTime - startTime;
		System.out.print( r + " in ms");
	}

}
