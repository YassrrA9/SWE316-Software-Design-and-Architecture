package complexNumbers;

public class Polar implements ComplexNumber<Polar>{
	
		
		private double radius;
		private double theta;
		
		public Polar() {
			
		}
		public Polar(double radius, double theta) {
			this.radius = radius;
			this.theta = theta;
		}
		
		public double getRadius() {
			return this.radius;
		}
		public double getTheta() {
			return this.theta;
		}
		public void setRadius(double radius) {
			this.radius = radius;
		}
		public void setTheta(double theta) {
			this.theta = theta;
		}
		
		@Override
		
		public void convert(double x, double y) {
			
			radius = Math.sqrt((Math.pow(x, 2)+ Math.pow(y, 2)));
			theta = Math.atan(y/x);
			setRadius(radius);
			setTheta(theta);
			
		}
		@Override
		public String toString() {
			return String.format("%.2f + %.2fi", (this.getRadius()*Math.cos(getTheta())),(this.getTheta()*Math.sin(getTheta())));
		}
		

	}


