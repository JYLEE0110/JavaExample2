package Chapter07;

public class Phone {
	// 상위클래스의 정의
	// 상위클래스는 넒은 의미를 가지고, 공통적인 변수나 메소드를 가지는 클래스
	
	String phoneNum;
	
	// 생성자
	
	public Phone() {
		
	}
	
	public Phone(String phoneNum) {
		this.phoneNum = phoneNum;	
	}
	
	void call() {
		System.out.println(phoneNum + "에서 전화를 겁니다.");
	}
}
