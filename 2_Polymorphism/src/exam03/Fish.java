package exam03;

public class Fish implements Flyable {

	public Fish() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void fly() {
		System.out.println("물고기가 지느러미를 이용해 날아요.");
	}

	public void swim() {
		System.out.println("물고기가 헤엄쳐요");
	}
	
}
