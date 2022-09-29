package class06;

public class SwitchDemo2 {

	public static void main(String[] args) {
		//matching cases must of same data type as a variable
		//no duplicated  case  in  switch -for ex answer="Yes" and answer="Yeah"
		//Y or y
		char choice='K';
		String answer;
		switch(choice) {
		case 'Y':// 'Y' because is  char->"Y" -not going  to work
			answer="Yes";
			break;
		case 'N':
			answer="No";
			break;
		case 'M':
			answer="Maybe";
			break;
			default:
				answer="Unknown";
				break;
			}
		System.out.println(answer);
		//Limitations of Switch Case
		/*
		 * switch case cannot use  logical  operators   ----- Y or y
		 * cannot  use  relational  operators ----   >,<,=
		 */
		
		/*
		 * CANNOT  work with boolean values (only case and default--does  not work)
		 * CE:Cannot switch on  a value of type boolean.
		 * boolean  boo=true;
	     * switch (boo){}
	     * 
	     * 
	     * CANNOT work with float/double and long
         */
}
}