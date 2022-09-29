package class06;

import java.util.Scanner;

public class Hw2SwitchGrade {

	public static void main(String[] args) {
		/*
		 * Allow user to enter grade (A, B, or C etc...) and then provide explanation:
		 *  A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
		 *  At the end your program should print which grade was entered by a user with explanation.
		 */

		Scanner tax=new Scanner(System.in);
		System.out.println("Enter your grade");
		char grade=tax.next().charAt(0);
		String answer;
		
		switch (grade) {
		case 'A':
			answer="Excellent";
			break;
		case 'B':
			answer="Good";
			break;
		case 'C':
			answer="Average";
			break;
		case 'D':
			answer="Bad";
			break;
			default:
				answer="Not Acceptable";
		}
		System.out.println("Your grade is "+grade+" and it is "+ answer);
		
		
	}

}
