package class13;

public class HwTask1NoSpace {

	public static void main(String[] args) {
		// Create a String that will hold a sentence. 
		//Write a program to get a new String without any spaces.
		
		String str="I like jazz music";
		
		for(int i=0;i<str.length();i++) {
			if(!(str.charAt(i)==' ')) 
	System.out.print(str.charAt(i));}
			

	System.out.println("         ");
	System.out.println();
	
	String str1="Today no java class";
	
	System.out.print(str1.replaceAll(" ",""));
	
	}

}