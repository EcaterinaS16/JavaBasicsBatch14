package class06;

public class LogicalNot {

	public static void main(String[] args) {
		boolean boo=!true;//false
		System.out.println(boo);
		
		boolean boo1=!false;
		System.out.println(boo1);//true
		
		boolean rain=true;
		if(!rain) {
			System.out.println("I will go for a walk");
		}
		
		String day="Monday";
		if(!day.equals("Sunday")) {
			System.out.println("today is  not Sunday");
		}
		System.out.println("End  of the program");
	}
	

}
