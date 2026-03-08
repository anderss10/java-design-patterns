package exam01;

public class Computer {
	private Body body;
	private Keyboard keyboard;
	private Monitor monitor;
	
	private void addBody(Body body) {
		this.body = body;
	}
	
	private void addKeyboard(Keyboard keyboard) {
		this.keyboard = keyboard;
	}
	
	private void addMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
}
