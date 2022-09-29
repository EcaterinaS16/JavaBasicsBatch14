package class09;

public class TaskAnimals {

	public static void main(String[] args) {
	
		String []animals= {"dog","cat","pig","horse","lion"};
		for(int i=0; i<animals.length; i++) {
			System.out.println(animals[i]);
		}
		System.out.println();
		for(String name:animals) {
			System.out.println(name+" ");
		}

	}

}
