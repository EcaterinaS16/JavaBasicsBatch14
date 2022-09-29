package class08;

public class ExFor {

	public static void main(String[] args) {
		for(int i=0;i<4;i++) {
			for (int j=0;j<=2;j++) {
			System.out.println("Hello");
			break; //when no break, and i --  -> 3 times hello
			}
			System.out.println("Bye");
		//	break;
		}
		boolean day=true;
		for(int i=1;i<=3;i++) {
			while(day) {
			System.out.println("Good day");
			break;
		}
			System.out.println(i);
			
	}

}}
