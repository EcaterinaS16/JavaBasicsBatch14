package class09;

public class ArrayFixedSize {

	public static void main(String[] args) {
		
		int[] nums=new int[3];
		nums[1]=12;
		nums[2]=13;
		System.out.println(nums[0]);
		
		String[] colors=new String[3];
		colors[0]="White";
		colors[1]="Pink";
		colors[2]="Black";
		//colors[3]="Yellow";// will show error:ArrayIndexOutOfBoudsException:3
		System.out.println(colors[2]);
//nums[0]=200; we can give value when not running/java execution of code
	}

}
