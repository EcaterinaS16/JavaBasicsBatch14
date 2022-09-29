package reviewclass4;

public class NestedForLoops {

	public static void main(String[] args) {
		/*
		 * 1 2 3 4 5
		 * 1 2 3 4 5
		 * 1 2 3 4 5
		 */
		for(int j=0;j<5;j++) { //if j=1-> we see 4 times
		for(int i=1;i<=5;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}}
