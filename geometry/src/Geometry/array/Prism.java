package Geometry.array;

public abstract class Prism {

	private int height;

	public int getHeight() {
		return height;
	}

	
	public Prism(int height) {
		super();
		this.height = height;
	}

	public abstract double getBaseArea();
	
	public double getVolume() {
		return height * getBaseArea();
	}
	
	public boolean isBigger(Prism prism) {
		
		return getVolume() > prism.getVolume();
		
	}
	
	
	
}
