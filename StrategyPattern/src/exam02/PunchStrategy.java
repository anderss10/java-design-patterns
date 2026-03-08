package exam02;

public class PunchStrategy implements AttackStrategy {
	
	@Override
	public void attack() {
		System.out.println("I can attack with punch.");
	}
}
