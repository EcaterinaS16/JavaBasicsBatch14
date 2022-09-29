package class13;

public class Task3DiffWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a=("Is it saturday? Is it raining? Do we have a Java Class today?");
		String[] arr=a.split("[?] ");
		int num=0;
		for(int i=0;i<arr.length;i++) {
			
		
		System.out.println(arr[i]);
		num=i+1;
		
		}
		System.out.println("There are "+ num+" sentences.");
			}

}
