package Class11;

public class Student {

	
	String name;
	String id;
	int age;
	double weight;
	char gender;
	
	
	void study() {
		System.out.println("Student is studying");
	}
	
	void deleteMessages() {
		System.out.println("Deleting messages from Discord");
	}
	
	void eat() {
		System.out.println("Eating pizzzzaa..");
	}
	
	
	public static void main(String[] args) {
		
		Student fraidoonObject=new Student(); //new Student()=> creates the object of student
		//Student friadoonObject->assign   variable
		
		fraidoonObject.name="Fraidoon";
		fraidoonObject.id="123";
		fraidoonObject.age=22;
		System.out.println(fraidoonObject.name);
		System.out.println(fraidoonObject.age);
		
		fraidoonObject.deleteMessages();
		fraidoonObject.deleteMessages();
		System.out.println("*********************");
		
	 Student student2=new Student();
	 student2.name="Asma";
	 student2.age=16;
	 student2.weight=30;
	 student2.gender='F';
	 System.out.println(student2.name);
	 student2.eat();
	}

}
