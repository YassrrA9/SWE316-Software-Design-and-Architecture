package complexNumbers;

public class Vector implements ComplexNumber<Vector>{
	
	private double x;
	private double y;
	
	
	public Vector() {
		
	}
	public Vector(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	@Override
	
	public void convert(double radius, double theta) {
		
		x = radius * Math.cos(theta);
		y = radius * Math.sin(theta);
		setX(x);
		setY(y);
		
	}
	
	@Override
	
	public String toString() {
		return String.format("%.2f + %.2fi", this.getX(),this.getY());
	}
	
	

}
