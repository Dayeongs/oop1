package inner;

public class Sample2App {
	
	public static void main(String[] args) {
		
		// 정적 내부 클래스는 외부 클래스에 대한 객체 생성없이 사용가능하다.
		Sample2.Inner2 inner2 = new Sample2.Inner2();
	}

}
