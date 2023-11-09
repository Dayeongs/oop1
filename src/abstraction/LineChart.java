package abstraction;

// 구현 클래스 정의하기
// 추상 메소드를 보유할 수 없다.
// 만약, 부모로부터 추상 메소드를 상속받았다면, 반드시 메소드재정의해야 한다.
public class LineChart extends Chart {
	
	@Override	// 자바 어노테이션(Java Annotation), 주석
	public void draw() {
		System.out.println("꺽은선 그래프를 그립니다.");
		
	}
}





