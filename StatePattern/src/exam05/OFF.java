package exam05;

public class OFF implements State {

	private static State instance = new OFF();
	
	public static State getInstance() {
		return instance;
	}
	
	private OFF() {
	}
	
	@Override
	public void on_button_pushed(Light light) {
		System.out.println("Light On!");
		light.setState(ON.getInstance());
	}
	
	@Override
	public void off_button_pushed(Light light) {
		System.out.println("반응 없음");
	}
	
}
