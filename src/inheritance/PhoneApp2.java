package inheritance;

public class PhoneApp2 {
	
	public static void main(String[] args) {
		
		// Iphone 객체는 Iphone 타입이다.
		Iphone p1 = new Iphone();
		p1.appleMusic();				// Iphone객체
		p1.applePay();					// Iphone객체
		p1.ip = "192.168.10.1";			// Smartphone객체
		p1.internet();					// Smartphone객체
		p1.game();						// Smartphone객체
		p1.number = "010-1111-1111";	// Phone객체
		p1.call();						// Phone객체
		p1.receive();					// Phone객체
		
		// Iphone 객체는 SmartPhone 타입이다.
		SmartPhone p2 = new Iphone();
//		p2.appleMusic();				// Iphone객체
//		p2.applePay();					// Iphone객체
		p2.ip = "192.168.10.1";			// Smartphone객체
		p2.internet();					// Smartphone객체
		p2.game();						// Smartphone객체
		p2.number = "010-1111-1111";	// Phone객체
		p2.call();						// Phone객체
		p2.receive();					// Phone객체

		
		// Iphone 객체는 Phone 타입이다.
		Phone p3 = new Iphone();
//		p3.appleMusic();				// Iphone객체
//		p3.applePay();					// Iphone객체
//		p3.ip = "192.168.10.1";			// Smartphone객체
//		p3.internet();					// Smartphone객체
//		p3.game();						// Smartphone객체
		p3.number = "010-1111-1111";	// Phone객체
		p3.call();						// Phone객체
		p3.receive();					// Phone객체	
	}

}
