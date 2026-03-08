package exam02;

abstract public class PrinterImpl {

	private String ID;
	
	public PrinterImpl(String ID) {
		this.ID = ID;
	}
	
	public int getID() {
		return Integer.parseInt(ID);
	}
	
	abstract public void print(Object msg);

}
