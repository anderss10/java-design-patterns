package exam02;

public class Light {
	
	private static int ON = 0; // 형광등이 켜진 상태
	private static int OFF = 1; // 형광등이 꺼진 상태
	private static int SLEEPING = 2; // 형광등의 취침등 상태
	
	private int state; // 형광등의 현재 상태
	
	public Light() {
		state = OFF; // 형광등의 초기 상태는 꺼져 있는 상태
	}
	
	public void on_button_pushed() {
		if (state == ON) { // 형광등이 켜져 있는 경우에 On 버튼을 누르면
			System.out.println("취침등 상태"); // 취침등 상태로 전환됨
			state = SLEEPING;
		}
		else if(state == SLEEPING) { // 형광등이 취침등 상태에 있는 경우
			System.out.println("Light On!"); // On 버튼을 누르면 켜진 상태로 전환됨
			state = ON;
		}
		else { // 형광등이 꺼져 있을 때 On 버튼을 누르면 켜진 상태로 전환
			System.out.println("Light On!");
			state = ON;
		}
	}
	
	public void off_button_pushed() {
		if (state == OFF) { // 형광등이 꺼져 있는 경우에 Off 버튼울 누르면
			System.out.println("반응 없음"); // 상태 전환 없음
		}
		else if(state == SLEEPING) { // 형광등이 취침등 상태에 있는 경우
			System.out.println("Light Off!"); // Off 버튼울 누르면 Off로 전환됨
			state = OFF;
		}
		else { // 형광등이 꺼져 있을 때 Off 버튼을 누르면 꺼진 상태로 전환
			System.out.println("Light Off!");
			state = OFF;
		}
	}
	
	
}
