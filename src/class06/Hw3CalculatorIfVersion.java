package class06;

import java.util.Scanner;

public class Hw3CalculatorIfVersion {

	public static void main(String[] args) {
		/*
		 * Using scanner class create calculator. 
		 * Allow user to enter 2 numbers and operator(+,-,*,/).
		 *  Based on operator provide the result to user.
		 *  Please complete this assignment in 2 ways: using if statement and switch case.
		 */

		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter first number");
		int number1=scanner.nextInt();
		
	
		System.out.println("Please enter second number");
		int number2=scanner.nextInt();
		System.out.println("Please enter an operator");
		char oper=scanner.next().charAt(0);

		
		if(oper=='+') {
			System.out.println(number1+number2);
		}else if(oper=='-') {
			System.out.println(number1-number2);
		}else if(oper=='*') {
			System.out.println(number1*number2);
		}else if(oper=='/') {
			System.out.println(number1/number2);
		}else {
			System.out.println("invalid");
		
		}
	//????
	}}

