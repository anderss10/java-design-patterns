package association;

public class Client {

	public static void main(String[] args) {

		Barista barista = new Barista();
		EspressoMachine espressoMachine = new EspressoMachine();
		barista.setEspressoMachine(espressoMachine);
		Espresso espresso = barista.makeEspresso();
		espresso.display();
		
	}

}
