package Class12;

public class StringDemo8 {

	public static void main(String[] args) {
	
		//String str="Batch 14 is good";
		String str="Batch 14 is good  537888 @@#$%% ASFFGH hjhjv";
		
		//replace method replaces 1 String w another in a String
		
		//replaceAll it takes a pattern and replace all the characters that follow that pattern
		System.out.println(str.replace("good","Excellent"));
		System.out.println(str);
		System.out.println(str.replaceAll("[a-z]", "#"));//we replace

	}

}
