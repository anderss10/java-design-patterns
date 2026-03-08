package exam02;

public class Triangle extends Shape {
	
	private int base;
	private int height;
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	
	@Override
	public void calcArea() {
		area = (base * height) / 2;
	}
	
	@Override
	public String getName() {
		return "삼각형";
	}

}
