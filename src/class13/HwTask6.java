package class13;

public class HwTask6 {

	public static void main(String[] args) {
	//	How would you swap  2 strings without a temporary variable?
		
		String name="John";
		String lastName="Smith";
		
		System.out.println("name= "+name);
		System.out.println("lastName= "+lastName);
		
		name=name+lastName;
		lastName=name.substring(0,name.length()-lastName.length());
		name=name.substring(lastName.length());
		
		System.out.println("name= "+name);
		System.out.println("lastName= "+lastName);
	
	}
	}


