package Class12;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String firstName="Olena";
		String  lastName="Dudka";
		System.out.println(firstName+lastName);//mostly used......this is shorter, cleaner; 
		System.out.println(firstName.concat(" ").concat(lastName));

		
		String  str=" ";
		//isEmpty() returns true is a String is empty, this method will  return false even 
		//is u have a space in a String variable, however the  isBlank method does not count the spaces
		System.out.println(str.isEmpty());
		
	//	System.out.println(str.isBlank());//error because it's java 8
	}

}
