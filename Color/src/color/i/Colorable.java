package color.i;

import java.awt.Color;

public interface Colorable {

	Color defaultcolor = Color.red;
	
	Color getColor();
		
	void setColor(Color color);
	
}
