package Replits;

public class Repl80 {

	public static void main(String[] args) {
		// Write a program to double the values of every element in the array and print it out.
		
		double[][] a = {
				{1.4,2.0,3.3,2},
				{4,1.5,6.1,1},
				{1.2,3.1,4,1.6}
			};
			
		  for(double []k:a) {
					  for (double i:k){

					  System.out.print(i*2+" ");
					  }
					  System.out.println();
					    }
	}

}
