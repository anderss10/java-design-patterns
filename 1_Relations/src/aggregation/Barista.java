package aggregation;

public class Barista {
	
	private EspressoMachine espressoMachine;

	public Barista() {
		super();
	}

	public void setEspressoMachine(EspressoMachine espressoMachine) {
		this.espressoMachine = espressoMachine;
	}

	public CafeLatte makeCafeLatte() {
		Espresso espresso = this.espressoMachine.makeEspresso();
		Milk milk = new Milk();
		CafeLatte cafeLatte = new CafeLatte();
		
		cafeLatte.setEspresso(espresso);
		cafeLatte.setMilk(milk);
		
		return cafeLatte;
	}
	
	@Override
	public String toString() {
		return "Barista";
	}
	
}
