package Class11;

public class HwPhone {
	
		//Create a Class “Phone”. Create 3 Objects of it: 
		//iPhone, Pixel, Samsung with specific  attributes and behaviors.
	
	String name;
	String model;
	int storage;
	double weight;
	boolean waterproof;
	
	void texting(){
		System.out.println("Texting friends");
		}
	void video(){
		System.out.println("Making video calls");
		}
	void reminders(){
		System.out.println("Reminds important events");
		}
	public static void main(String[] args) {
		HwPhone Iphone=new HwPhone();
			Iphone.name="iPhone";
			Iphone.model="14 Pro";
			Iphone.storage=256;
			Iphone.weight=7.26;
			Iphone.waterproof=true;
			System.out.println("name "+Iphone.name+" model "+Iphone.model);
			Iphone.texting();
			
			System.out.println();
			
	    HwPhone Pixel=new HwPhone();
			Pixel.name="Pixel";
			Pixel.model="7 Pro";
			Pixel.storage=256;
			Pixel.weight=6.9;
			Pixel.waterproof=false;	
			System.out.println("name "+Pixel.name+" model "+Pixel.model);
			Pixel.video();

			System.out.println();	
	      HwPhone Samsung=new HwPhone();
			Samsung.name="Samsung";
			Samsung.model="Galaxy Z Fold 4";
			Samsung.storage=512;
			Samsung.weight=7.2;
			Samsung.waterproof=false;
			
			System.out.println("name "+Samsung.name+" model "+Samsung.model);
			Samsung.reminders();
		
	}
	}

