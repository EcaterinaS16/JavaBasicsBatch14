package class09;

public class TaskCars {

	public static void main(String[] args) {
		String [] cars= {"Toyota","Huynndai","Honda","BMW","Mercedes","Acura"};
		for(int i=0;i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		System.out.println();
		for(String name:cars) {
			System.out.println(name+" ");
		}
		

	}

}
