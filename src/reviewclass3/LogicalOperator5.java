package reviewclass3;

public class LogicalOperator5 {

	public static void main(String[] args) {
		
		String country="Turkiye";//=Korea -no output
		/*
		*if(country.equals("Turkiye")|| country.equals("Japan") ||country.equals("Spain")) {
		*	System.out.println("");
		*System.out.println("Welcome to  USA");
		*}
        */
		if(!country.equals("Korea")) {
			System.out.println("Welcome to USA");
		}
	}

}
