package reviewclass4;

public class LoopForEx {

	public static void main(String[] args) {

	 //print # from 1 to 10
	//for( int i=0; i<=10; i++) {
	//	System.out.println(i);
		for( int i=0; i!=3; i++) { //if i=10 we get infinite loop bcz never =3
			                        // if i=-1 ->-1,0,1,2
		System.out.println(i);       
	}

}}
