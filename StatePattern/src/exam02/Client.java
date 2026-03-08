package exam02;

public class Client {

	public static void main(String[] args) {
		Light light = new Light();
		light.off_button_pushed(); // 반응 없음
		light.on_button_pushed();  // Light On!
		light.on_button_pushed(); // 취침등 상태
		light.on_button_pushed(); // Light On!
		light.on_button_pushed(); // 취침등 상태!
		light.off_button_pushed(); // Light Off!
		light.off_button_pushed(); // 반응 없음
	}

}
