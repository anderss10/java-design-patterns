package exam04;

public class ChineseCook implements ICook {

	public ChineseCook() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void makeRice() {
		System.out.println("중식 밥");
	}
	@Override
	public void makeSoup() {
		System.out.println("중식 국");
	}
	@Override
	public void makeSalad() {
		System.out.println("중식 무침");
	}
	@Override
	public void makeSource() {
		System.out.println("중식 양념");
	}
}
