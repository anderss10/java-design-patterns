package exam02;

public class Square extends Shape {

	private int width;
	private int length;
	
	public Square(int width, int length) {
		this.width = width;
		this.length = length;
	}

	@Override
	public void calcArea() {
		area = width * length;
	}
	
	@Override
	public String getName() {
		return "사각형";
	}
	
	public void printCircum() {
		System.out.println("사각형 둘레: " + (width + length)*2);
	}

}
