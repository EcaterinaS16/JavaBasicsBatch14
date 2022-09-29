package Class12;

public class StringDemo {

	public static void main(String[] args) {
		
		//Proper way of  creating   an object
		 String str=new String("Java");//  =String name="Java;  //for  all other  than String
		 
		 // Simpler and shorter way to  provide  by Java Creators to make our  life a little easier
		 //the most used 
		 String name="Java class today "; //only  works for  String and Wrapper classes
		                     
		 /*
		  * Counts the # of  characters  in a string including  the spaces
		  */
		 
		 System.out.println(str.length());
		 System.out.println(name.length());
		 if(name.length()>15) {
			 System.out.println("Name  can't  be more than  15  characters");
		 }
	}

}
