package class01;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Write a Java Program to check whether  number is Even or Odd
 */
		int number=0;
		System.out.println(number%2);
		// if we take the modulus of a number by 2 and answer is 0 it  is always an Even number
		//otherwise it is an odd number
		
		if(number%2==0) {
			System.out.println("Number is Even");
		} else {
			System.out.println("Number is Odd");
		}
	}

}
