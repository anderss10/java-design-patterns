package generalization;

public class Coffee {

	private String name = "Coffee";
	
	public Coffee() {
		super();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println(this.name);
	}
	
}
