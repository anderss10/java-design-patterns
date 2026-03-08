package exam04;

public class SLEEPING implements State {

	@Override
	public void on_button_pushed(Light light) {
		System.out.println("Light On!");
		light.setState(new ON());
	}
	
	@Override
	public void off_button_pushed(Light light) {
		System.out.println("Light Off!");
		light.setState(new OFF());
	}
	
}
