package etc;

public class CarTester {
	
	public void testCar(Car car) {
		// 운전 기능
		car.go();
		car.stop();
		
		// 에어콘 기능
		if (car instanceof AirCon) {
			AirCon air = (AirCon) car;
			air.airControl();
		}
		
		// 내비게이션 기능
		if (car instanceof Navigation) {
			Navigation navi = (Navigation) car;
			navi.navi();
		}
	}
	
	public static void main(String[] args) {
		
		Tico tico = new Tico();
		Sonata sonata = new Sonata();
//		Sample sample  = new Sample(); 오류
		
		CarTester tester = new CarTester();
		tester.testCar(tico);
		tester.testCar(sonata);
//		tester.testCar(sample); 오류
		
	}

}
