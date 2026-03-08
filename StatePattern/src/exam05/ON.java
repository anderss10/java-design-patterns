package exam05;

public class ON implements State {
	
	private static State instance = new ON();
	
	public static State getInstance() {
		return instance;
	}
	
	private ON() {
	}
	
	@Override
	public void on_button_pushed(Light light) {
		System.out.println("취침등 상태");
		light.setState(SLEEPING.getInstance());
	}
	
	@Override
	public void off_button_pushed(Light light) {
		System.out.println("Light Off!");
		light.setState(OFF.getInstance());
	}
}
