package class06;

import java.util.Scanner;

public class Hw3CalculatorSwitchVersion {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter first number");
		int number1=scanner.nextInt();
		
		System.out.println("Please enter an operator");
		char oper=scanner.next().charAt(0);
		System.out.println("Please enter second number");
		int number2=scanner.nextInt();
		boolean wrongOperator=false;

        
		int answer=0;
		switch(oper) {
		case '+':
			answer=number1+number2;
			break;
		case '-':
			answer=number1-number2;
			break;
		case '*':
			answer=number1*number2;
			break;
		case '/':
			answer=number1/number2;
			default:
				System.out.println("invalid");		
			break; 
		}
			if(!wrongOperator) {
				System.out.println(answer);//=0 why???
				
			}}}
	


