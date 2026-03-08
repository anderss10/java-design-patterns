package exam01;

public class Rectangle extends Shape {

	private int width;
	private int height;

	public Rectangle() {
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public void draw() {
		System.out.println("Rectangle Draw");
	}
	
}
