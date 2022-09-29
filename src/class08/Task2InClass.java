package class08;

import java.util.Scanner;

public class Task2InClass {

	public static void main(String[] args) {
		//create a secret number and let user guess,
		// when guessed program should say->you won!
		
		Scanner input=new Scanner(System.in);

			int secretBox=11; 
		    int num;
		do {
			System.out.println("Please enter a number");
			num=input.nextInt();
				
		}while (num!=secretBox);
		System.out.println("You won!");
		}
	}


	

