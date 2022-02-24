package solidFiguresPackage;

import java.util.InputMismatchException;

public class Cylinder extends SolidFigure {
	
	private double radius;
	
	public Cylinder(double height,double radius) throws InputMismatchException{
		super(height);
		if(radius<=0) {
			throw new InputMismatchException("Input < = 0");
		}else {
			this.radius = radius;
		}
	}
	
	public double getRadius() {
		return this.radius;
		
	}
	
	public void setRadius(double radius)throws InputMismatchException{
		if(radius<=0) {
			throw new InputMismatchException("Input < = 0");
		}else {
			this.radius = radius;
		}
	}
	
	
	
	@Override
	public
	
	double calculateVolume() {
		double volume;
		
		volume = this.getHeight() * (Math.pow(this.getRadius(), 2)) * Math.PI ;
		return volume;
	}

	
	
}
