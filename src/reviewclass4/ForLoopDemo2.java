package reviewclass4;

public class ForLoopDemo2 {

	public static void main(String[] args) {
		// i want to print this pattern 10,8,6,4,2,0
		for( int i=10;i>=0; i=i-2) {//i!=-1 ->infinite loop because the value will be never -1
			System.out.println(i);
		}
//******************
		// 9 5 1
		System.out.println(                        );
		for( int i=9;i>=1; i-=4) {//i!=-1 ->infinite loop because the value will be never -1
			System.out.println(i);
		}
	}

}
