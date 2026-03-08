package exam04;

public class ON implements State {
	
	@Override
	public void on_button_pushed(Light light) {
		System.out.println("취침등 상태");
		light.setState(new SLEEPING());
	}
	
	@Override
	public void off_button_pushed(Light light) {
		System.out.println("Light Off!");
		light.setState(new OFF());
	}
}
