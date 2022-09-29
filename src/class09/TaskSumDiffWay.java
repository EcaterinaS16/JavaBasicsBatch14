package class09;

public class TaskSumDiffWay {

	public static void main(String[] args) {
		
	
		int[]numbers= {10,20,30,40};
		int sum=0;
		System.out.print("Sum of the numbers in this array is:=");
		for(int i=0;i<numbers.length;i++) {
			sum+=numbers[i];}
			System.out.println(sum);
		
	System.out.println();
	
	sum=0;
	for(int number:numbers) {
		sum+=number;
	}
	System.out.println(sum);
		}
}
	


