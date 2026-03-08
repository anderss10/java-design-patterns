package exam02;

public class Client {
	public static void main(String[] args) {
		Robot r1 = new TaekwonV("태권V");
		Robot r2 = new Atom("아톰");
		
		r1.setAttackStrategy(new MissileStrategy());
		r1.setMovingStrategy(new WalkingStrategy());
		
		r2.setAttackStrategy(new PunchStrategy());
		r2.setMovingStrategy(new FlyingStrategy());
		
		System.out.println("My name is " + r1.getName());
		r1.move();
		r1.attack();
		
//		System.out.println("My name is " + r2.getName());
//		r2.move();
//		r2.attack();
		
		r1.setAttackStrategy(new PunchStrategy());
		System.out.println("My name is " + r1.getName());
		r1.move();
		r1.attack();
	}
}
