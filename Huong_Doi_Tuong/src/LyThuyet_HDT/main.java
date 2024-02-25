package LyThuyet_HDT;

import FACTORY_PATTERN.ShapeFactory;
import FACTORY_PATTERN.shape;

public class main {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();
		shape shape2 = shapeFactory.getShape("RETANGLE");
		shape2.draw();
	}
}
