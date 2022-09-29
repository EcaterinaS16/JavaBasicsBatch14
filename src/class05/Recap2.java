package class05;

public class Recap2 {

	public static void main(String[] args) {
		boolean allergy = true; // =false->You are lucky
		String allergyType = "pollen";//=Dairy-> line 9  and  15//=Milk->  line 9 only//=pollen->line 9  only
		                                           //pollen  is not equal to Pollen !
		if (allergy) {
			System.out.println("Lets check what allergy you have");
			if (allergyType.equalsIgnoreCase("Pollen")) {  //pollen and Pollen are same meaning, -> we can write
				       //if(allergyType.equalsIgnoreCase("Pollen")-then Upper/lower case doesnt matter
				System.out.println("Try to stay indoors when trees are blooming");
			} else if (allergyType.equals("Peanut")) {
				System.out.println("Please stay  away from peanuts");
			} else if (allergyType.equals("Dairy")) {
				System.out.println("Stay  away from dairy products");
			} else {
				System.out.println("We need to do some test");
			}

		} else {
			System.out.println("You are lucky");
		}

	}

}
