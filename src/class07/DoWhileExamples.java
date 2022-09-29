package class07;

import java.util.Scanner;

public class DoWhileExamples {

	public static void main(String[] args) {
		
		/*
		 * did u get  a job?
		 * to ask a user we use scanner
		 */
		
     Scanner  sc=new  Scanner(System.in);
     String answer;
     do {
     System.out.println("Did you get a job?");
      answer=sc.next();
     } while(!answer.equals("yes"));
     System.out.println("Congrats");
	}
}