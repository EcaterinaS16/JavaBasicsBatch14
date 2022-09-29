package Class11;

public class PhoneTester {

	public static void main(String[] args) {
		/*
		 * if class who's object we are  creating is present inside  the  same package
		 * we don't need to import
		 * to import: import.class11.HwPhone
		 */
		
		HwPhone Iphone=new HwPhone();
		Iphone.name="Iphone";
		Iphone.model="Iphone 14 Pro Max";
		Iphone.storage=256;
		Iphone.weight=7.26;
		Iphone.waterproof=true;

		Iphone.texting();
		
		//new Phone()=>To create the object
		HwPhone Samsung=new HwPhone();
		Samsung.name="Samsung";
		Samsung.model="Galaxy Z Fold 4";
		Samsung.storage=512;
		Samsung.weight=7.2;
		Samsung.waterproof=false;
		Samsung.reminders();
	}

}
