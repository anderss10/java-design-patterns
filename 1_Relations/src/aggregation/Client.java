package aggregation;

public class Client {

	public static void main(String[] args) {

		Barista barista = new Barista();
		EspressoMachine espressoMachine = new EspressoMachine();
		
		barista.setEspressoMachine(espressoMachine);
		CafeLatte cafeLatte = barista.makeCafeLatte();
		
		cafeLatte.display();
		
	}

}
