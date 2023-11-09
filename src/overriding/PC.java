package overriding;

public class PC {
	
	Printer p;	// Printer 타입: Printer와 그 하위 클래스를 연결
	
	public void printDocument() {
		p.print();
	}

}
