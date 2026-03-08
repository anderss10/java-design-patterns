package exam01;

public class Client {

	public static void main(String[] args) {
		Robot r1 = new TaekwonV("TaekwonV");
		Robot r2 = new Atom("Atom");
		
		System.out.println("My name is " + r1.getName());
		r1.move();
		r1.attack();
		
		System.out.println("My name is " + r2.getName());
		r2.move();
		r2.attack();
	}

}
