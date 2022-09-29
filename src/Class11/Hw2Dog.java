package Class11;

public class Hw2Dog {

		// Create a Dog Class and create 3 different objects of it: 
		//Husky, Bulldog, Labrador with specific  attributes and behaviors.

	String breed;
	int age;
	double weight;
	String furcolor;
	String eyecolor;
	
	void energetic() {
		System.out.println("Likes walks");
	}
	void loyal() {
		System.out.println("Loyal friend");
	}
	void intelligent () {
		System.out.println("Can be trained");
	}
	
	public static void main(String[] args) {
		Hw2Dog Dog1=new Hw2Dog();
		Dog1.breed="Husky";
		Dog1.age=2;
		Dog1.weight=21;
		Dog1.furcolor="Grey";
		Dog1.eyecolor="Blue";
		System.out.println("breed "+Dog1.breed+" furcolor " + Dog1.furcolor);
		Dog1.energetic();
		
		System.out.println();
		
		Hw2Dog Dog2=new Hw2Dog();
		Dog2.breed="Bulldog";
		Dog2.age=1;
		Dog2.weight=25;
		Dog2.furcolor="	Black";
		Dog2.eyecolor="Brown";
		System.out.println("breed "+Dog2.breed+" furcolor " + Dog2.furcolor);
		Dog2.loyal();
		
		System.out.println();
		Hw2Dog Dog3=new Hw2Dog();
		Dog3.breed="Labrador";
		Dog3.age=4;
		Dog3.weight=27;
		Dog3.furcolor="Brown";
		Dog3.eyecolor="Brown";
		System.out.println("breed "+Dog3.breed+" furcolor " + Dog3.furcolor);
		Dog1.intelligent();
		
		System.out.println();
	}

}
