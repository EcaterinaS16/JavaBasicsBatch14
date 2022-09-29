package class09;

public class TaskLargestNumber {

	public static void main(String[] args) {
		
		int[] num= {23,19,-2,42,1001,76,4};
		int largest=0; //=num[0]  for (int i=1 ...the rest the same
		for(int i=0;i<num.length; i++) {
			if(num[i]>largest) {
				largest=num[i];
			}
		}
			System.out.println(largest);
			System.out.println();//another way
			
			largest=num[0];
			for(int n:num) {
				if(n>largest) {
					largest=n;
				}
			}
			System.out.println(largest);
		}
	}


