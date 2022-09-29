package class13;

public class HwTask2 {

	public static void main(String[] args) {
		/*
		 * Create a String that should be combination of letters, numbers and special characters.
		 *  Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
		 */

		
		  String str=("AAbb76489HHGbk$$$%%@hbg");
		  String fix=str.replaceAll("[^a-zA-Z0-9]","");
		 
		   System.out.println(fix.length());
		 
			System.out.println();
			//Task 3
			String a=("Is it saturday? Is it raining? Do we have a Java Class today?");
			String[] arr=a.split("[?] ");
			System.out.println("There are " + arr.length+" sentences");

		  }
	}
