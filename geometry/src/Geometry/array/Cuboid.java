package Geometry.array;

public class Cuboid extends Prism{

	private double aSide;
	private double bSide;
	
	
	
	
	public Cuboid(int height, double aSide, double bSide) {
		super(height);
		this.aSide = aSide;
		this.bSide = bSide;
	}

	public Cuboid(int height) {
		super(height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getBaseArea() {
		// TODO Auto-generated method stub
		return aSide*bSide;
	}

	@Override
	public String toString() {
		return "Cuboid [aSide=" + aSide + ", bSide=" + bSide + ", getHeight()=" + getHeight() + "]";
	}
	
	

}
