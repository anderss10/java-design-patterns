package exam04;

public class KoreanCook implements ICook {

	public KoreanCook() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void makeRice() {
		System.out.println("한식 밥");
	}
	@Override
	public void makeSoup() {
		System.out.println("한식 국");
	}
	@Override
	public void makeSalad() {
		System.out.println("한식 무침");
	}
	@Override
	public void makeSource() {
		System.out.println("한식 양념");
	}
}
