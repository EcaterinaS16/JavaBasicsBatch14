package class06;

import java.util.Scanner;

public class Hw1SwitchCountry {

	public static void main(String[] args) {
		/*
		 * Ask user to enter their country and capture it.
		 *  Once values are captured print which language user speaks.
		 */
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Where are you from?");
		String country=scanner.nextLine();
		String language;
		
		switch (country) {
		case "Moldova":
			language="Romanian";
			break;
		case "England":
			language="English";
			break;
		case "China":
			language="Chinese";
			break;
		case "France":
			language="French";
			break;
		case "Hungary":
			language="Hungarian";
			break;
			default:
			language="Unknown";
			break;
		}
		System.out.println("You are from "+ country+" and your speak "+ language);
		
	}

}
