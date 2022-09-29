package Replits;

import java.util.Scanner;

public class Repl44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		  System.out.println("Enter a car ");
		String name=scan.nextLine();
		  System.out.print("Your favorite car is ");
		if(name.equals("BMW")){
		    System.out.println("german car");
		  }else if(name.equals("Toyota")){
		    System.out.println("japanese car");
		  }else if(name.equals("Maserati")){
		    System.out.println("italian car");
		  } else{
		    System.out.println("unknown");
	}

}
}
