package class06;

public class LogicalNotEx2 {

	public static void main(String[] args) {
		// find the  largest number and then
		//find if  the largest is even  or  odd?
		

		
int n1 = 100;
int n2 = 200; //if all =100 will not be executed
int n3 = 300;
int largest=0;
if (n1 > n2 && n1 > n3) {
	largest=n1;
}else if (n2 > n3 && n2 > n1) {
largest=n2;
} else if (n3 > n1 && n3 > n2) {
	largest=n3;
	
	System.out.println(largest + " is the largest number");
	if(largest!=0) {
if(largest%2==0) {
	System.out.println(largest+ " is even number");
}else {
	System.out.println(largest+ " is odd number");
}
}
}}}








