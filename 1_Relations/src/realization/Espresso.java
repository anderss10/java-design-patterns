package realization;

public class Espresso implements ICoffee {

	private String name = "Espresso";
	
	public Espresso() {
		super();
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void display() {
		System.out.println(this.name);
	}
	
}
