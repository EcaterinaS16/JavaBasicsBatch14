package reviewclass2;

public class IfElseIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * If  we need one outcome based on if conditions we use 
 * 
 */
		int number = 0;

        if (number > 0) {
            System.out.println("number is positive");
        }
        if (number < 0) {
            System.out.println("number is negative");

        }
        if (number == 0) {
            System.out.println("number is 0");

        }
// *******second program***************

        if (number > 0) 
        {
            System.out.println("number is positive");
        } 
        else if (number < 0) 
        {
            System.out.println("number is negative");

        }
        else  {
            System.out.println("number is 0");
        }


	}

}
