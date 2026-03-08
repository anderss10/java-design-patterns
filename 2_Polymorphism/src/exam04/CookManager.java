package exam04;

public class CookManager {
	
	// private ICook cook = new KoreanCook(); OCP위반
	private ICook cook;

	public CookManager(ICook cook) { // upcasting
		this.cook = cook;
	}
	
	public void setCook(ICook cook) { // upcasting
		this.cook = cook;
	}
	
	//밥
	public void orderRice() {
		cook.makeRice(); // 다형성, 위임
	}
	
	//국
	public void orderSoup() {
		cook.makeSoup(); // 다형성, 위임
	}
	
	//무침
	public void orderSalad() {
		cook.makeSalad(); // 다형성, 위임
	}
	
	//양념
	public void orderSource() {
		cook.makeSource(); // 다형성, 위임
	}

}
