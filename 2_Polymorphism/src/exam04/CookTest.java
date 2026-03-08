package exam04;

public class CookTest {

	public static void main(String[] args) {

		ICook cook = new KoreanCook();
		CookManager manger = new CookManager(cook);
		manger.orderRice();
		manger.orderSoup();
		
		ICook cook1 = new ChineseCook();
		manger.setCook(cook1);
		manger.orderRice();
		manger.orderSoup();
	}

}
