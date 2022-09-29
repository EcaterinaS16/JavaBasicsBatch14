package class07;

public class InClasTask123 {

	public static void main(String[] args) {
		//print numbers  from 100 to 1
 System.out.println("Task 1");
		int x=100;
		while(x>=1) {
			System.out.print(x+" ");
			x--;
		}
		System.out.println("            ");
		System.out.println("            ");
		
		System.out.println("Task2");

		//print even numbers from 20 to 100
		int i=20;
		while(i<=100) {
			System.out.print(i+" ");
			i ++;
		}
		System.out.println("           ");
		System.out.println("            ");
		
		System.out.println("Task 3");
		//print only odd # from 100 to 1, 2 diff ways
		int a=100;
		while(a>=1) {
			if(a%2==1) { //%==1-num is odd
				System.out.print(a+" ");
			}
			a--;
		}
		System.out.println("          ");
		System.out.println("            ");
		
		System.out.println("Another way");
		int b=99;
		while(b>=1) {
			System.out.print(b+" ");
			b-=2;
		}
	
	}

}
