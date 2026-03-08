package association;

public class Barista {
	
	private EspressoMachine espressoMachine;

	public Barista() {
		super();
	}

	public void setEspressoMachine(EspressoMachine espressoMachine) {
		this.espressoMachine = espressoMachine;
	}

	public Espresso makeEspresso() {
		return espressoMachine.makeEspresso();
	}
	
}
