package reviewclass3;

public class LogicalOperator {

	public static void main(String[] args) {
		boolean programmer=false;//=true, output if block
		boolean manualTester=true;//output else block
		boolean knowFramework=false;
		
		if(programmer && manualTester&&knowFramework) {
			System.out.println("You can be an automation engineer");
		}else {
			System.out.println("You must know a programmer language and manual testing " + "to be an automation engineer")
		;
		
		}
	}

}
