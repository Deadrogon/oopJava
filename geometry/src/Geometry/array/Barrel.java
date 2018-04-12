package Geometry.array;

public class Barrel extends Prism{

	private double radius;
	
	public Barrel(int height, double radius) {
		super(height);
		this.radius = radius;
	}

	@Override
	public double getBaseArea() {
		// TODO Auto-generated method stub
		return Math.pow(radius, 2) * Math.PI;
	}

	@Override
	public String toString() {
		return "Barrel [radius=" + radius + ", getHeight()=" + getHeight() + "]";
	}
	
	

}
