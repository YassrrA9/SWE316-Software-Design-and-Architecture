package complexNumbers;

public class FactoryOfComplex {
	
	private int choice;
	
	public void getForm(int choice, double w, double z) {
		Vector vectorForm = new Vector();
		Polar polarForm = new Polar();
		if (choice == 1) {
			 vectorForm = new Vector(w,z);
			System.out.println(vectorForm.toString());

		}else if(choice == 2) {
			 polarForm = new Polar(w,z);
				System.out.println(polarForm.toString());
		}else if(choice == 3) {
			vectorForm.convert(w,z);
			System.out.println(vectorForm.toString());
		}else{
			polarForm.convert(w,z);
			System.out.println(polarForm.toString());
		}
	}

}
