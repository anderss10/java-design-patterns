package composition;

public class CafeLatte {
	
	private String name = "CafeLatte";
	
	private Espresso espresso = new Espresso();
	private Milk milk = new Milk();

	public CafeLatte() {
		super();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println(this.name + " (" + this.espresso + " + " + this.milk + ")");
	}
	
	@Override
	public String toString() {
		return "CafeLatte";
	}
	
}
