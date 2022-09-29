package class07;

import java.util.Scanner;

public class Hw6 {

	public static void main(String[] args) {

		// *  	6. Declare a variable to store a price for a coffee. 
		// *  Ask the user to pay for a coffee. Keep asking to pay for coffee until the user enters the EXACT amount .
		// *   If the user gives more than coffee price --> ask them to give less, if the user gives less money then ask to give more.
		// *    Once user give EXACT amount print “Please enjoy your coffee

		Scanner input=new Scanner(System.in);
		System.out.println("Please pay the coffee?");
			int drink=4; //we can use double also
		    int price;
		do {
			
			price=input.nextInt();
			
			if(price>drink) {
				System.out.println("give less money");
			}else if(price<drink) {
				System.out.println("give more money");
			}
				
		}while (price!=drink);
		System.out.println("Please enjoy your coffee");
		}
	}


