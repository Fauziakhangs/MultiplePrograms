package test;
//create questions and compare there result as enter by the user
//you can use array or arraylist
//equalscaseignore

import java.util.Scanner;

import java.util.*;

public class MultipleChoiceQuestions {

	static ArrayList<String> yourAns = new ArrayList<>();
	static ArrayList<String> Answers = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Answers.add("a");
		Answers.add("c");
		Answers.add("b");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("*****Multiple Choice Questions******");
		System.out.println("1) What is 2+2? ");
		System.out.println("a)4\nb)5\nc)9\nd)10\n");
		
		System.out.println("2) What is 5+2? ");
		System.out.println("a)9\nb)1\nc)7\nd)3\n");

		System.out.println("3) What is 10+2? ");
		System.out.println("a)11\nb)12\nc)6\nd)18\n");
		System.out.println("Type Your Answers Now:\n1) ");
		String value1 = sc.next();
		System.out.print("2) ");
		String value2 = sc.next();
		System.out.print("3) ");
		String value3 = sc.next();
		
		yourAns.add(value1);
		yourAns.add(value2);
		yourAns.add(value3);
		
		for(int i=0; i<3; i++) {
		if(yourAns.get(i).equals(Answers.get(i)) ) {
			System.out.println("Correct Answer.."+yourAns.get(i));
		}
		else {
			System.out.println("Incorrect answer "+yourAns.get(i)+". Correct answer is  "+Answers.get(i));
		}
		}

	}

}
