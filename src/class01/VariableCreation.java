package class01;

public class VariableCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1 way to create a variable
		byte b=10;
	//2 way to create a variable
		int i; //create a variable
		i=100; //assign value
		//we need to create a variable only once
		//then we can use as many times we need during the program
		
	//3 way
		//create a variable=declare a variable
		int num1, num2, num3;
		num1=100;//assign value or initialize a variable
		num2=200;//assign the value
		num3=300;
		//in num1=100; error->duplicate variable
		//? Can i change a value of a variable? -yes
		System.out.println(num2); //200
		num2=2000; //reassign the value
		System.out.println(num2);//2000 because of the order
	}

}
