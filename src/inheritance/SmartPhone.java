package inheritance;

/**
 * 인터넷과 게임 기능이 있는 스마트폰을 표현하는 클래스다.
 * 고유 속성: ip 주소
 * 고유 기능: 인터넷 기능, 게임 기능
 */
public class SmartPhone extends Phone {
	
	String ip;
	
	public void internet() {
		System.out.println("인터넷을 이용합니다.");
	}
	
	public void game() {
		System.out.println("게임을 합니다.");
	}

}
