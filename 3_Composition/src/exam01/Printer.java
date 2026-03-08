package exam01;

public abstract class Printer {
	
	private String ID;
	
	public Printer(String ID) {
		this.ID = ID;
	}
	
	public int getID() {
		return Integer.parseInt(ID);
	}// return값에 따른 파싱
	
	abstract void print(Object msg);
	
}
