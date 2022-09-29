package class13;

public class HwTask5 {

	public static void main(String[] args) {
		// How would you check if String is palindrome or not? aba=> true
		//Abbc =>false

		
		String pal="civic";
		String reversepal="";
		for(int i=pal.length()-1;i>=0;i--) {
			reversepal+=pal.charAt(i);
		}
		
		if(pal.equals(reversepal)) {
			System.out.println("The word is palindrome ");
		}else {
			System.out.println("Not palindrome");
		}
	}

}
