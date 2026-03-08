package exam02;

public abstract class Robot {
	private String name;
	
	// Strategy를 멤버로 소유
	private MovingStrategy movingStrategy;
	private AttackStrategy attackStrategy;
	
	public Robot(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void attack() {
		attackStrategy.attack(); //위임, 다형성
	}
	
	public void move() {
		movingStrategy.move(); //위임, 다형성
	}
	
	public void setMovingStrategy(MovingStrategy movingStrategy) {
		this.movingStrategy = movingStrategy;
	}
	
	public void setAttackStrategy(AttackStrategy attackStrategy) {
		this.attackStrategy = attackStrategy;
	}
	
}
