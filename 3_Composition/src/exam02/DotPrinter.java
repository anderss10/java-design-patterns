package exam02;

public class DotPrinter extends PrinterImpl{

	public DotPrinter(String ID) {
		// TODO Auto-generated constructor stub
		super(ID);
	}
	
	@Override
	public void print(Object msg) {
		System.out.println("*도트 방식으로 프린트를 시작합니다.*");
		System.out.println(msg.toString());
		System.out.println("*도트 방식으로 프린트를 종료합니다.*");
	}

}
