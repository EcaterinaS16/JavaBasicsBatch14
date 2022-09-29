package class13;

public class HwTask4 {

	public static void main(String[] args) {
		//How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
		
		
        String str="This is a sentence i want to reverse";
		String[]words=str.split(" ");
		String  reverseString="";
		for(String w:words)

		{
   String reverseword="";
   for(int i=w.length()-1;i>=0;i--) {
	   reverseword=reverseword+w.charAt(i);
   }
   reverseString=reverseString+reverseword+" ";
		}
		System.out.println(reverseString);
}
	}


