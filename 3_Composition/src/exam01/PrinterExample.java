package exam01;

public class PrinterExample {

	public static void main(String[] args) {

		Printer[] printers = new Printer[3];
		printers[0] = new InkjetPrinter("101");
		printers[1] = new DotPrinter("102");
		printers[2] = new LaserPrinter("103");
		
		for(Printer printer : printers) {
			if(printer.getID() == 101) {
				System.out.println("101프린터는 수리해야합니다. 따라서 메시지를 출력할 수 없습니다.\n");
				continue;
			}// if end
			
			printWelcome(printer);
			
		}// for end
		
		
		
	}// main() end
	
	public static void printWelcome(Printer printer) {
		System.out.println("이 프린터의 ID는 "+printer.getID()+"입니다.");
		printer.print("프린터의 세계에 초대합니다."); // 다형성
		System.out.println("");
	}

}// PrinterExample