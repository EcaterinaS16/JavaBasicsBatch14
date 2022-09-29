package Replits;

import java.util.Scanner;

public class Repl40 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		  System.out.println("Enter name of the instructor");
		  String  name=scanner.nextLine();
	     
		  if(name.equals("Asghar")){
		 System.out.println("Will take care of Java Assignment");
	  } else if(name.equals("Moazzam")){
	    System.out.println("Will take care of SDLC Assignment");
	  }else if(name.equals("Weqas")){
	    System.out.println("Will take care of Selenium Assignment");
	  }else if(name.equals("Asel")){
	    System.out.println("Will take care of every Assignment");
	  }else{
	    System.out.println("Invalid instructor selected");
	  }

	  
	}
	
	}


