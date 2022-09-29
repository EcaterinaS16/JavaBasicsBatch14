package Replits;

public class Repl72 {

	public static void main(String[] args) {
		// Write a program that creates an array with the
		//following values{s, a, y,  b, n, c, t,  d, a, e, x} 
		//Print the values so the output should look like below: syntax


		String s="s";
	    String y="y";
	    String a="a";
	    String b="b";
	    String n="n";
	    String c="c";
	    String t="t";
	    String d="d";
	    String e="e";
	    String x="x";
	    
	    String arr[]=new String[]{s, a, y, b, n, c, t, d, a, e, x};
	    for(int i=0;i<=arr.length;i+=2){
	      System.out.print(arr[i]);
	    }
	  }
	}


