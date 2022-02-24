package solidFiguresPackage;
import java.util.InputMismatchException;

public abstract class SolidFigure implements Comparable<SolidFigure>{
	
	private double height;
	
	public SolidFigure(double height) throws InputMismatchException{
		if((height<=0)) {
			throw new InputMismatchException("Input < = 0");
		}else {
			this.height = height;
			
		}
		
	}
	
	public double getHeight() {
		return this.height;
	}
	
	
	public void setHeight(double height) throws InputMismatchException{
		if(height<=0) {
			throw new InputMismatchException("Input < = 0");
		}else {
		this.height = height;
		}
	}
	
	
	abstract double calculateVolume();
	
	@Override
	public int compareTo(SolidFigure o) {
		if((this.calculateVolume())>(((SolidFigure) o).calculateVolume())) {
			return 1;
		}else if((this.calculateVolume())<(((SolidFigure) o).calculateVolume())) {
			return -1;
		}else {
			return 0;
		}
	}

}
