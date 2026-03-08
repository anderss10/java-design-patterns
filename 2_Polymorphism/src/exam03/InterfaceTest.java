package exam03;

public class InterfaceTest {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Fish f1 = new Fish();
		
		Flyable[] flys = {p1, f1};
		
		for(Flyable fly : flys) {
			fly.fly(); // 다형성
			if(fly instanceof Person)
				((Person) fly).walk();
			if(fly instanceof Fish)
				((Fish) fly).swim();
		}// end for
		
	}

}
