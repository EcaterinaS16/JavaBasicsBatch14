package Class12;

public class StringDemo3 {

	public static void main(String[] args) {
	
		String str=" i  love java";
		System.out.println(str);
		/*
		 * Remove the spaces before and  after the
		 * String but not the ones which are present in between
		 */
		
		System.out.println(str.trim());
		/*
		 * startsWith=>checks if a String Starts w a specific letter or word
		 * endsWith=>checks if a String Ends w a specific letter or word
		 * contains=>checks if a String Contains a specific letter or word
		 */
		String   str2="Java is Very easy";
System.out.println(str2.startsWith("Java"));// we also can write ("J") but  not("j")  its  case sensitive
	
	System.out.println(str.endsWith("y"));
	
	//System.out.println(str2.contains("very"));
	
	/*
	 * Method chaining helps us call multiple methods on a single line 1 method after an other
	 */
	
	System.out.println(str2.toLowerCase().contains("very"));
	
	}

}
