package exam03;

public class Person implements Flyable, Singable {

	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void fly() {
		System.out.println("사람이 팔벌려 날아다녀요.");
	}
	
	@Override
	public void sing() {
		System.out.println("사람이 목소리를 이용해서 노래불러요.");
	}
	
	public void walk() {
		System.out.println("사람이 걸어다녀요.");
	}

}
