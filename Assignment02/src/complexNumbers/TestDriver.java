package complexNumbers;

import java.util.Scanner;

public class TestDriver {
	public static void main(String[] args) {
		int choice;
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the number of the choice >>>");
		System.out.println("\n1- Show a VECTOR form"
				+ "\n2- Show a POLAR form"
				+ "\n3- Convert from POLAR to VECTOR form"
				+ "\n4- Convert from VRCTOR to POLAR form");
		choice = kb.nextInt();
		FactoryOfComplex o = new FactoryOfComplex();
		switch (choice) {
		case 1:
			System.out.println("Enter x >");
			double x = kb.nextDouble();
			System.out.println("Enter y >");
			double y = kb.nextDouble();
			o.getForm(choice,x,y);
			break;
		case 2:
			System.out.println("Enter radius >");
			double radius = kb.nextDouble();
			System.out.println("Enter theta >");
			double theta = kb.nextDouble();
			o.getForm(choice,radius,theta);
			break;
		case 3:
			System.out.println("Enter radius >");
			 radius = kb.nextDouble();
			System.out.println("Enter theta >");
			 theta = kb.nextDouble();
			o.getForm(choice,radius,theta);
			break;
		case 4:
			System.out.println("Enter x >");
			 x = kb.nextDouble();
			System.out.println("Enter y >");
			 y = kb.nextDouble();
			o.getForm(choice,x,y);
			break;

		}
kb.close();		
	
	}

	

}
