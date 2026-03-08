package exam05;

public class Client {
	public static void main(String[] args) {
		Light light = new Light(); // Singleton Pattern
		light.off_button_pushed();
		light.on_button_pushed();
		light.on_button_pushed();
		light.on_button_pushed();
		light.on_button_pushed();
		light.off_button_pushed();
		light.off_button_pushed();
	}
}
