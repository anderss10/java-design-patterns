package exam01;

public class ShapeTest {

	public void init(Shape[] arrayOfShapes) {
		arrayOfShapes[0] = new Rectangle(); // upcasting
		arrayOfShapes[1] = new Triangle(); // upcasting
		arrayOfShapes[2] = new Circle(); // upcasting
	}
	
	public void drawAll(Shape[] arrayOfShapes) {
		for(Shape shape : arrayOfShapes) {
			shape.draw(); // 다형성
		}
		// if shape 가 Rectangle
		// else if shape 가 Triangle
	}

	public static void main(String[] args) {
		Shape[] arrayOfShapes = new Shape[3];
		ShapeTest test = new ShapeTest();
		test.init(arrayOfShapes);
		test.drawAll(arrayOfShapes);
	}

}
