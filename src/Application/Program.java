package Application;

import java.util.Locale;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		AbstractShape a1 = new Circle(Color.BLACK, 2.0);
		AbstractShape a2 = new Rectangle(Color.WHITE, 3.0, 4.0);
		
		System.out.println("Circle color: " + a1.getColor());
		System.out.println("Circle area: " + String.format("%.2f", a1.area()));
		System.out.println("Rectangle color: " + a2.getColor());
		System.out.println("Rectangle area: " + String.format("%.2f", a2.area()));
	}
}
