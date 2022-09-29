package reviewclass5;

import java.util.Arrays;

public class ArraysDemo2 {

	public static void main(String[] args) {
		//how many elements in arr?
		
		int[] arr=new int[] {10,20,30};
		//last index is always size -1, because arrays index start from 0
		System.out.println(arr.length);
        for(int i=0;i<arr.length;i++) {
        	
        }System.out.println();
 String[]dresses=new String[] {"Pink Dress","cocktail","Summer dress","Night dress","Pencil Dress"};
        System.out.println(dresses.length);
        
        //Mostly this is how u will be using arrays
        for(int i=0;i<dresses.length;i++) {
        	System.out.println("Let's try "+dresses[i]);
        }
        System.out.println();
        
        //enhanced for loop
        for(String dress:dresses) {
        	System.out.println(dress);
        }
        System.out.println("*************");
        
        //prints all the elements of an array without a loop
        System.out.println(Arrays.toString(dresses));
	}

}
