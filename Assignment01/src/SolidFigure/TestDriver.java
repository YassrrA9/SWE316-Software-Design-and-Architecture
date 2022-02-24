package SolidFigure;
import java.util.InputMismatchException;
import solidFiguresPackage.Cylinder;
import solidFiguresPackage.RectangularPrism;

public class TestDriver {
	
	public static void main(String[] args) {
		
		// FIRST TEST were both +ve & Cylinder greater than RectangularPrism.
		System.out.println("Test Case 1 :");
        Cylinder cylinder1 = new Cylinder(10.9,12);
		RectangularPrism RectangularPrism1 = new RectangularPrism(11,13.2,17.3);
		System.out.printf("Cylinder Volume = %.2f %n", cylinder1.calculateVolume());
		System.out.printf("RectangularPrism Volume =  %.2f %n", RectangularPrism1.calculateVolume());
		System.out.println(cylinder1.compareTo(RectangularPrism1));
		
		
		// SECOND TEST were both +ve & Cylinder less than RectangularPrism.
		System.out.println("-------------------------------- \n");
		System.out.println("Test Case 2 :");
        cylinder1.setHeight(1);
        System.out.printf("Cylinder Volume = %.2f %n", cylinder1.calculateVolume());
		System.out.printf("RectangularPrism Volume =  %.2f %n", RectangularPrism1.calculateVolume());
		System.out.println(cylinder1.compareTo(RectangularPrism1));
		
		
		// THIRD TEST were both +ve & equal.
		System.out.println("-------------------------------- \n");
		System.out.println("Test Case 3 :");
        cylinder1.setHeight(1);
        cylinder1.setRadius(1);
        RectangularPrism1.setHeight(Math.PI);
        RectangularPrism1.setlength(1);
        RectangularPrism1.setwidth(1);
        System.out.printf("Cylinder Volume = %.2f %n", cylinder1.calculateVolume());
		System.out.printf("RectangularPrism Volume =  %.2f %n", RectangularPrism1.calculateVolume());
		System.out.println(cylinder1.compareTo(RectangularPrism1));
		try {
			// FOURTH TEST when one element = 0 .
			System.out.println("-------------------------------- \n");
			System.out.println("Test Case 4 :");
	        cylinder1.setHeight(0);
	        cylinder1.setRadius(1);
	        RectangularPrism1.setHeight(Math.PI);
	        RectangularPrism1.setlength(1);
	        RectangularPrism1.setwidth(1);
	        System.out.printf("Cylinder Volume = %.2f %n", cylinder1.calculateVolume());
			System.out.printf("RectangularPrism Volume =  %.2f %n", RectangularPrism1.calculateVolume());
			System.out.println(cylinder1.compareTo(RectangularPrism1));

	}catch(InputMismatchException e) {
		System.out.println("Element value less than or equal ZERO");
	}
		
		

	}

}
