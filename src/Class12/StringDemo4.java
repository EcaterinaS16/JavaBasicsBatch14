package Class12;

public class StringDemo4 {

	public static void main(String[] args) {
		
		String str="Shah";
		String  str2="Shah";
		String str3=new String("Shah");
		
		if(str.equals("shah")) {
	//	if(str==str2) {
		//if(str.equals("Shah")) {
			System.out.println("I found it");
		}
		/*
		 * equals checks if 2 Strings are exactly the same w exact same case
		* equalsIgnoreCase checks if 2 Strings are exactly the same but does not care about case of letters
		*/
		
		if(str.equalsIgnoreCase("shah")) {
			
		System.out.println("I found it w equalsIgnoreCase");
		}
	}

}
