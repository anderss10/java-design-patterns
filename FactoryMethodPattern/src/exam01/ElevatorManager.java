package exam01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ElevatorManager {
	private List<ElevatorController> controllers;
	private ThroughputScheduler scheduler;
	
	public ElevatorManager(int controllerCount) {
		controllers = new ArrayList<ElevatorController>(controllerCount);
		
		for (int i = 0; i < controllerCount; i++) {
			ElevatorController controller = new ElevatorController(i + 1);
			controllers.add(controller);
		}
		
		scheduler = new ThroughputScheduler();
	}
	
	void requestElevator() {
		
	}
	
}
