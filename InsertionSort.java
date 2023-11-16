package test;

import java.util.Random;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(9);
		int[] numbers = new int[10];
		for(int i=0; i< numbers.length; i++) {
			numbers[i] = rand.nextInt();
			
		}
		System.out.println("Before");
		printArray(numbers);
		
		insertionSort(numbers);
		System.out.println("After");
		printArray(numbers);
	}
	
	private static void insertionSort(int[] inputArray) {
		for(int i =1; i<inputArray.length; i++) {
			int currentValue = inputArray[i];
		 int j = i-1;
		 while (j >= 0 && inputArray[j] > currentValue) {
			 inputArray[j+1] = inputArray[j];
			 j--; 
		 }
		 inputArray[j+1] = currentValue;
		}
	}	
		private static void printArray(int[] numbers) {
			for(int i=0; i<numbers.length; i++) {
				System.out.println(numbers[i]);
			}
		}
	}


