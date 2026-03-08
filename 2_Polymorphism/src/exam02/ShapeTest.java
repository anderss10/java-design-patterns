package exam02;

public class ShapeTest {

	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[4];
		shapes[0] = new Triangle(10, 20);
		shapes[1] = new Square(10, 5);
		shapes[2] = new Square(10, 10);
		shapes[3] = new Triangle(20, 10);
		
		for(Shape shape : shapes) {
			
			shape.calcArea(); // 다형성
			shape.printArea();
			
			if(shape instanceof Square) {
				((Square)shape).printCircum();
			} // end if
			
		} // end for
		
	}

}
