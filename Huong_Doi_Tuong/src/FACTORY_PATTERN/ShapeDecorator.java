package FACTORY_PATTERN;
//DECORATOR PATTERN
public class ShapeDecorator {
	protected shape decoratedShape;
	public ShapeDecorator(shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}
	public void draw() {
		decoratedShape.draw();
	}
}
