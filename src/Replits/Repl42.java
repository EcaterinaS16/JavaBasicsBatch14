package Replits;

import java.util.Scanner;

public class Repl42 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		  System.out.println("Enter the roll number of the Child");
		  int num=scan.nextInt();
		  String name;

		  switch(num){
		    case 101:
		      name="Student name: Ramesh";
		      break;
		    case 102:
		      name="Student name: Mahesh";
		      break;
		    case 103:
		      name="Student name: Mukesh";
		        break;
		    default:
		      name="Not found Student name: in Class";
		      break;
		      
		  }
		System.out.println(name);
		  
		}
		

	}


