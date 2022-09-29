package class10;

public class ExamplCountry2 {

	public static void main(String[] args) {
		
		String[][] countries= {
				{"Usa","Canada"},//1 array w index 0
				{"Peru","Brazil","Colombia","Ecuador"}, // 2 array w index 1
				{"Ethiopia","Egypt","Kenya"},
				{"Germany","Turkiye","Moldova","Ukraine"},
				{"Kazakhstan","Afghanistan","Korea"}			
		};
		System.out.println("-----getting all values from 2d array--------");
		for(String[] country:countries) {
			for(String c:country) {
				if(c.equals("Moldova")) {
					System.out.println(c+" It  is my  home country");
				}else {
				System.out.println(c+" ");
			}
			System.out.println();
		}
		
	}

	}}
