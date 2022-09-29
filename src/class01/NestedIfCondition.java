package class01;

public class NestedIfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int time=9;
		String day="Monday";
		/*
		 * it is called  outer if-condition, if it is true then only inner condition will be checked.
		 * if it is false nothing from inner if-condition  will be executed, it is like the main door
		 * if main door is closed, we can't enter the building
		 */ 
		
		if(day.equals("Monday")){//  outer if condition // as String is non primitive we can't use == sign
			                    //we have to use .equals
			
			//inner if conditions
			if(time>7) {
				System.out.println("Lets go to office");
			}
			if(time<6) {
				System.out.println("Lets sleep more");
			}
		}
		
	}

}
