package class07;

import java.util.Scanner;

public class Hw45 {

	public static void main(String[] args) {
	
	//4. Print odd numbers between 20 and 50 (2 ways)
	 
		int odd=50;
		while(odd>=20) {
			if(odd%2==1) {
			System.out.print(odd+" ");
		}
			odd--;
		}
		System.out.println("         ");
		
		 //5. Prompt the user to ask the name 3 times and print "Good afternoon +name...
		Scanner scan=new Scanner(System.in);
		String name;
		for(int i=1;i<=3;i++) {
			System.out.println("What is your name?");
			name=scan.nextLine();
		System.out.println("Good afternoon "+name);
		}
	
	System.out.println("       ");

		} 
}

		
		
		
		
		
		
		
		


