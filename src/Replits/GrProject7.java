package Replits;

import java.util.Scanner;

public class GrProject7 {

	public static void main(String[] args) {
		// Write a java program to check whether a given # is prime or not
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		boolean prime=false;
	
		
	for(int i=2;i<=num/2; i++) {
		if(num%i==0){
		prime=true;
		break;
		}
		}
			
		 if(!prime) {
			 System.out.println(num+ " is not prime");
		 }else {
			System.out.println(num+ " is prime");}
		
			
	}
	}

