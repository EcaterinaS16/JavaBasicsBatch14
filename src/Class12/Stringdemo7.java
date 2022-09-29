package Class12;

public class Stringdemo7 {

	public static void main(String[] args) {
		
		String str="I am always confused i was kidding";
		
		System.out.println(str.indexOf("a"));
		System.out.println(str.indexOf("s"));
		System.out.println(str.indexOf(" "));
	
		/*
		 * substring() gives a smaller string from a String we can start the starting
		 * part to this method and it will return us the subString from  the index
		 */
		System.out.println(str.substring(5)); //gives a sm part 
		System.out.println(str.substring(5,11)); //specify the end part
		
	

	}

}
