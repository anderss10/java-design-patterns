package exam02;

public abstract class Shape {
	
	protected int area;
	
	public abstract void calcArea(); // 추상 메서드는 오버라이딩 필수
	public abstract String getName();
	
	public void printArea() {
		System.out.println(getName() + "넓이: " + area);
	}

/*
	public static void main(String[] args) {
		Shape shape = new Shape(); 추상 클래스는 인스턴스화 불가능
	}
*/

}
