package color;

import java.awt.Color;

import color.i.Colorable;

	public class Pen implements Colorable {

		private Color color;
		private String brand;

		public Pen(String name, int price, int tax, Color color, String brand) {
			super();
			this.color = color;
			this.brand = brand;
		}

		@Override
		public String toString() {
			return super.toString() + ", Color: " + color + ", brand:" + brand;
		}

		public Color getColor() {
			return color;
		}
		public void setColor(Color color) {
			this.color = color;
		}

}