package Class11;

public class Dog {

//state=attributes=properties=fields
		
		 String name;
		 String color;
		 String breed;
		 double weight;
		 int age;
		 
		 //These are the behaviors of a dog
		// behaviors=methods=functions
	void bark()	 {
		System.out.println("Barking.........");
	}
	
	void sleep () {
		System.out.println("Dog is sleeping........");
	}
	public static void main(String[]args) {
		//creating objects from a class
		//new Dog();=>creates an object of class Dog
		Dog dog1=new Dog();
		//calling a behavior on an object
		dog1.bark();
		dog1.sleep();
		
	}
	}


