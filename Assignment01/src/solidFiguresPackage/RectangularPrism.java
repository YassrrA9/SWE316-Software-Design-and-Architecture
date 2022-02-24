package solidFiguresPackage;

import java.util.InputMismatchException;

public class RectangularPrism extends SolidFigure {
	
private double length;
private double width;
	
	public RectangularPrism(double height,double length, double width) throws InputMismatchException{
		super(height);
		if((length<=0)||(width<=0)) {
			throw new InputMismatchException("Input < = 0");
		}else {
			this.length = length;
			this.width = width;
		}
	}
	
	public double getlength() {
		return this.length;
		
	}
	
	public void setlength(double length)throws InputMismatchException{
		if(length<=0) {
			throw new InputMismatchException("Input < = 0");
		}else {
			this.length = length;
		}
	}
	
	public double getwidth() {
		return this.width;
		
	}
	
	public void setwidth(double width)throws InputMismatchException{
		if(width<=0) {
			throw new InputMismatchException("Input < = 0");
		}else {
			this.width = width;
		}
	}
	
	
	
	@Override
	public
	 double calculateVolume() {
		double volume;
		
		volume = this.getHeight() * this.getlength() * this.getwidth() ;
		return volume;
	}


}
