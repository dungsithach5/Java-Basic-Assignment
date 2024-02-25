package FACTORY_PATTERN;

public class ShapeFactory {
	public shape getShape(String sType) {
		if(sType == null) {
			return null;
		}
		if(sType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}
		if(sType.equalsIgnoreCase("RETANGLE")) {
			return new Rectangle();
		}
		return null;
	}
}
