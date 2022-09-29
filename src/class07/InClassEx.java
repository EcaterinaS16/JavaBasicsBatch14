package class07;

public class InClassEx {

	public static void main(String[] args) {
		
		//print all numbers from 50 to 20

		int a=50;
		while(a>=20) {
			System.out.print(a+" ");
			a--;
		}
		System.out.println("        ");
		//print all even numbers from 1 to 20
		int b=1;
		while (b<=20) {
			if(b%2==0) {//%2==0 num is even
			System.out.print(b+" ");
		}
			b++;
	}
		System.out.println("Another way ");
		int c=2;
		while(c<=20) {
			System.out.print(c+" ");//2
			c+=2;//2+2=4+2=6
		}
		
		
	}
}
