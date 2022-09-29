package project;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
	/* Using Scanner create an array of countries and capitals. When an array is created
	 *  for countries and capitals, then ask the user to store countries and
     * their capitals in those arrays then retrieve the country and capital
     * and print them together.
     */
		
  Scanner scanner=new Scanner(System.in);
System.out.println("Please enter how many countries you want to process");
	   int size=scanner.nextInt();
  //2 arrays 1 to store the countries and the other 1 to store the capitals
	    String [] countries=new String[size];
	    String [] capitals=new String[size];
	    
 //this is just to consume that extra enter that we will be getting from line 18
	    scanner.nextLine();
	    for(int i=0;i<size;i++) {
	    System.out.println("Please Enter the country name");
	     countries[i]=scanner.nextLine();

	     System.out.println("Please Enter the capital for "+countries[i]);
	     capitals[i]=scanner.nextLine();
	        }
  //Prints the arrays  in a good format
	      System.out.println(Arrays.toString(countries));
	      System.out.println(Arrays.toString(capitals));

  for(int i=0;i<size;i++) {
	  System.out.println("The country "+ countries[i]+ " Has the capital "+capitals[i]);
  }
	    }

	}
