package Replits;

import java.util.Scanner;

public class Repl41 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		   System.out.println("Enter the age of the Child");
		   int age=input.nextInt();
		   String name;
		   
		   switch(age){
		     case 1:
		       name="You can Crawl";
		       break;
		     case 2:
		       name="You can Talk";
		       break;
		     case 3:
		       name="You can Dance";
		       break;
		     case 4:
		       name="You can get Trouble";
		       break;
		     default:
		       name="I don't know how old you are";
		        break;
		   }
		   
		   System.out.println(name);
		 }

	}


