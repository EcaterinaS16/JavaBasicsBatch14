package Replits;

public class Repl81 {

	public static void main(String[] args) {
		/* Write a program that prints the highest value in the array.
		* *Expected Output:
		* input [5,4,8]...8
		*/ 

	       int [] arr=new int[]{5,4,8};
	     
	      int highest=arr[0];
	      for(int i=0;i<arr.length;i++){
	        for(int j=0;j<arr.length;j++){
	          if(arr[i]>highest){
	            highest=arr[i];
	          }
	         
	          }
	        }
	    
	       System.out.println(highest);
	}

}
