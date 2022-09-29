package class06;

import java.util.Scanner;

public class Ex4 {

	
		public static void main(String[] args) {
			Scanner box=new Scanner(System.in);
			System.out.println("Please enter your birth month");
			String month=box.nextLine();
			String mySeasonMonth;
			
			if(month.equals("March")|| month.equals("April")||  month.equals("May")){
				mySeasonMonth="Spring";
			} 
			else  if (month.equals("June")|| month.equals("July")||  month.equals("August")){
				mySeasonMonth="Summer";
			}
			else if(month.equals("September")|| month.equals("October")||  month.equals("November")) {
				mySeasonMonth="Fall";}
			 else if(month.equals("December")|| month.equals("January")||  month.equals("February")){
				 mySeasonMonth="Winter";}
		 else {
			 mySeasonMonth="Invalid month";
		}
			System.out.println(mySeasonMonth);
			}
	}


