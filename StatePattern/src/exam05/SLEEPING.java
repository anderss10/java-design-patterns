package exam05;

public class SLEEPING implements State {

	private static State instance = new SLEEPING();
	
	public static State getInstance() {
		return instance;
	}
	
	private SLEEPING() {
	}
	
	@Override
	public void on_button_pushed(Light light) {
		System.out.println("Light On!");
		light.setState(ON.getInstance());
	}
	
	@Override
	public void off_button_pushed(Light light) {
		System.out.println("Light Off!");
		light.setState(OFF.getInstance());
	}
	
}
