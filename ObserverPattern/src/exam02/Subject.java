package exam02;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	
	private List<Observer> observers = new ArrayList<Observer>();
	
	public void attach(Observer observer) {
		observers.add(observer);
	} // 옵저버 즉 통보 대상을 추가함
	
	public void detach(Observer observer) {
		observers.remove(observer);
	} // 옵저버 즉 통보 대상을 제거함
	
	// 통보 대상 목록, 즉 observers의 각 옵저버에게 변경을 통보함
	public void notifyObservers() {
		for(Observer o : observers) o.update();
	}

}
