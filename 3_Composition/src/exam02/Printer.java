package exam02;

public class Printer {
	
	private String ID;
	private PrinterImpl printerImpl;

	public Printer(PrinterImpl printerImpl) {
		this.printerImpl = printerImpl;
	}
	public Printer(String ID) {
		this.ID = ID;
	}
	
	public String getID() {
//		return Integer.parseInt(ID)
		return printerImpl.getID() + ""; // 위임
	}
	
	public void print(Object msg) {
		printerImpl.print(msg);
	}

}
