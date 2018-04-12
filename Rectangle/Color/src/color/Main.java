package color;

import java.awt.Color;

import color.i.Colorable;
import color.ColoredDot;
import color.Pen;

public class Main {

	public static void main(String[] args) {

		Colorable coloredDot = new ColoredDot(10, 20, Color.BLACK);
		System.out.println(coloredDot);
		coloredDot.setColor(Color.BLUE);
		System.out.println(coloredDot);

		Colorable coloredPen = new Pen("asd", 10, 10, Color.GREEN, "Singetta");
		System.out.println(coloredPen);
		coloredPen.setColor(Color.BLUE);
		System.out.println(coloredPen);
		

		setColorToDefaultColor(coloredDot);
		System.out.println(coloredDot);
		setColorToDefaultColor(coloredPen);
		System.out.println(coloredPen);
		

	}
	
	private static void setColorToDefaultColor(Colorable colorable) {
		colorable.setColor(colorable.defaultcolor);
	}

}