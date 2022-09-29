package class07;

public class EX2WithFor {

	public static void main(String[] args) {
		// print even # from 20 to 1(2 ways)
		

		for(int i=20;  i>=1; i-=2) {
			System.out.print(i+" ");
		}
		System.out.println();
	 //we used for because we know how many times to repeat
	
 System.out.println("If condition inside for loops");
 for(int i=20;  i>=1; i--) {
	 if (i%2==0) {
		System.out.print(i+" ");
	}
}}}
