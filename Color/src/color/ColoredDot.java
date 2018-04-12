package color;

import java.awt.Color;

import color.i.Colorable;

public class ColoredDot extends Dot implements Colorable {

	private Color color;
	
	
	public ColoredDot(Color color) {
		super(0, 0);
		this.color = color;
	}
	
	public ColoredDot(int xcoor, int ycoor, Color color) {
		super(xcoor, ycoor);
		this.color = color;
	}

	public ColoredDot(int xcoor, int ycoor) {
		super(xcoor, ycoor);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return super.toString()+", color: "+color;
	}
	
	@Override
	public Color getColor() {
		return color;
	}
	
	@Override
	public void setColor(Color color) {
		this.color=color;
	}
	
}
